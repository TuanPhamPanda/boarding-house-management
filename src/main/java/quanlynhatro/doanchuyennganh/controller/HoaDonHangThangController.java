package quanlynhatro.doanchuyennganh.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quanlynhatro.doanchuyennganh.dto.response.HoaDonHangThangResponseDTO;
import quanlynhatro.doanchuyennganh.dto.response.Response;
import quanlynhatro.doanchuyennganh.entity.HoaDonHangThang;
import quanlynhatro.doanchuyennganh.security.JwtTokenProvider;
import quanlynhatro.doanchuyennganh.service.HoaDonHangThangService;

import java.util.List;

@RestController
@RequestMapping("/HoaDonHangThang")
public class HoaDonHangThangController implements IController<HoaDonHangThang> {
    @Autowired
    HoaDonHangThangService hoaDonHangThangService;
    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Override
    @GetMapping("/")
    public Response<List<HoaDonHangThang>> getAll() {
        try {
            return hoaDonHangThangService.getAll();
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    @GetMapping("/HoaDonsTheoUserName/{username}")
    public Response<List<HoaDonHangThang>> getByUserName(@PathVariable String username) {
        return hoaDonHangThangService.getByTaiKhoan(username);
    }

    @GetMapping("/getByUserNameAndStateIsFalse")
    public Response<List<HoaDonHangThang>> getByUserNameAndStateIsFalse(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        if (token == null) {
            return null;
        }
        String username = jwtTokenProvider.getUsername(request.getHeader("Authorization"));
        if (username != null)
            return hoaDonHangThangService.getByTaiKhoanAndStateIsFalse(username);
        return null;
    }

    @Override
    public Response<HoaDonHangThang> insert(HoaDonHangThang hoaDonHangThang) {
        return null;
    }

    @PostMapping("/createHoaDonsByMonthYear/{month}/{year}")
    public Response<List<HoaDonHangThangResponseDTO>> createHoaDonsByMonthYear(@PathVariable Integer month,
            @PathVariable Integer year) {
        return hoaDonHangThangService.createHoaDonsByMonthYear(month, year);
    }

    @Override
    public Response<HoaDonHangThang> update(HoaDonHangThang hoaDonHangThang) {
        return null;
    }

    @GetMapping("/chiTietHoaDon/{maHoaDon}")
    Response<HoaDonHangThangResponseDTO> chiTietHoaDon(@PathVariable("maHoaDon") int maHoaDon) {
        return hoaDonHangThangService.chiTietHoaDon(maHoaDon);
    }
}
