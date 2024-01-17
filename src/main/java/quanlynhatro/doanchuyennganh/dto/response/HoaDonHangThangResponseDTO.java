package quanlynhatro.doanchuyennganh.dto.response;

import lombok.*;
import quanlynhatro.doanchuyennganh.entity.ChiTietPhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.HoaDonHangThang;
import quanlynhatro.doanchuyennganh.entity.SoDien;
import quanlynhatro.doanchuyennganh.entity.SoNuoc;

import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class HoaDonHangThangResponseDTO {
    private HoaDonHangThang hoaDonHangThang;
    private SoDien soDien;
    private SoNuoc soNuoc;
    private List<ChiTietPhieuThueTienIch> chiTietPhieuThueTienIches;
}
