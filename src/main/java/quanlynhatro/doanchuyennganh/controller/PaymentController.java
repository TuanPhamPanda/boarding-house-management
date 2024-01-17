package quanlynhatro.doanchuyennganh.controller;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quanlynhatro.doanchuyennganh.config.Config;
import quanlynhatro.doanchuyennganh.entity.HoaDonHangThang;
import quanlynhatro.doanchuyennganh.repository.IHoaDonHangThangRepository;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    IHoaDonHangThangRepository hoaDonHangThangRepository;

    private static int maHoaDon = -1;

    @GetMapping("/pay/{mahoadon}")
    public String getPay(@PathVariable("mahoadon") int maHoaDonHangThang, HttpSession session)
            throws UnsupportedEncodingException {
        HoaDonHangThang hoaDonHangThang = hoaDonHangThangRepository.findById(maHoaDonHangThang).get();
        String vnp_Version = "2.1.0";
        String vnp_Command = "pay";
        String orderType = "other";
        long amount = (long) hoaDonHangThang.getSoTien() * 100;
        String bankCode = "NCB";

        String vnp_TxnRef = Config.getRandomNumber(8);
        String vnp_IpAddr = "127.0.0.1";

        String vnp_TmnCode = Config.vnp_TmnCode;

        Map<String, String> vnp_Params = new HashMap<>();
        vnp_Params.put("vnp_Version", vnp_Version);
        vnp_Params.put("vnp_Command", vnp_Command);
        vnp_Params.put("vnp_TmnCode", vnp_TmnCode);
        vnp_Params.put("vnp_Amount", String.valueOf(amount));
        vnp_Params.put("vnp_CurrCode", "VND");

        vnp_Params.put("vnp_BankCode", bankCode);
        vnp_Params.put("vnp_TxnRef", vnp_TxnRef);
        vnp_Params.put("vnp_OrderInfo", "Thanh toan don hang:" + vnp_TxnRef);
        vnp_Params.put("vnp_OrderType", orderType);

        vnp_Params.put("vnp_Locale", "vn");
        vnp_Params.put("vnp_ReturnUrl", Config.vnp_ReturnUrl);
        vnp_Params.put("vnp_IpAddr", vnp_IpAddr);

        Calendar cld = Calendar.getInstance(TimeZone.getTimeZone("Etc/GMT+7"));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String vnp_CreateDate = formatter.format(cld.getTime());
        vnp_Params.put("vnp_CreateDate", vnp_CreateDate);

        cld.add(Calendar.MINUTE, 15);
        String vnp_ExpireDate = formatter.format(cld.getTime());
        vnp_Params.put("vnp_ExpireDate", vnp_ExpireDate);

        List fieldNames = new ArrayList(vnp_Params.keySet());
        Collections.sort(fieldNames);
        StringBuilder hashData = new StringBuilder();
        StringBuilder query = new StringBuilder();
        Iterator itr = fieldNames.iterator();
        while (itr.hasNext()) {
            String fieldName = (String) itr.next();
            String fieldValue = vnp_Params.get(fieldName);
            if ((fieldValue != null) && (fieldValue.length() > 0)) {
                // Build hash data
                hashData.append(fieldName);
                hashData.append('=');
                hashData.append(URLEncoder.encode(fieldValue, StandardCharsets.US_ASCII));
                // Build query
                query.append(URLEncoder.encode(fieldName, StandardCharsets.US_ASCII));
                query.append('=');
                query.append(URLEncoder.encode(fieldValue, StandardCharsets.US_ASCII));
                if (itr.hasNext()) {
                    query.append('&');
                    hashData.append('&');
                }
            }
        }
        String queryUrl = query.toString();
        String vnp_SecureHash = Config.hmacSHA512(Config.secretKey, hashData.toString());
        queryUrl += "&vnp_SecureHash=" + vnp_SecureHash;
        String paymentUrl = Config.vnp_PayUrl + "?" + queryUrl;
        maHoaDon = maHoaDonHangThang;
        return paymentUrl;
    }

    @GetMapping("/ipn")
    public void handleVnpIpn(@RequestParam Map<String, String> params, HttpServletResponse response,
            HttpSession session) throws Exception {
        String vnp_ResponseCode = params.get("vnp_ResponseCode");
        int maHoaDonHangThang = maHoaDon;
        // Xử lý trạng thái thanh toán dựa trên vnp_ResponseCode
        if ("00".equals(vnp_ResponseCode)) {
            // Trạng thái thanh toán thành công, cập nhật hóa đơn tương ứng
            HoaDonHangThang hoaDonHangThang = hoaDonHangThangRepository.findById(maHoaDonHangThang).get();
            if (hoaDonHangThang != null) {
                hoaDonHangThang.setTrangThaiThanhToan(true);
                hoaDonHangThangRepository.save(hoaDonHangThang);
            }
        }
        // Gửi phản hồi về VNPay để xác nhận đã nhận thông báo IPN
        response.getWriter().write("IPN received and processed successfully");
    }

}
