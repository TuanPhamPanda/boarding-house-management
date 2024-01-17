package quanlynhatro.doanchuyennganh.entity.compositekey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanlynhatro.doanchuyennganh.entity.ChiTietPhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.HoaDonHangThang;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietHoaDonHangThangId implements Serializable {
    private HoaDonHangThang hoaDonHangThang;
    private ChiTietPhieuThueTienIch chiTietPhieuThueTienIch;
}
