package quanlynhatro.doanchuyennganh.entity.compositekey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanlynhatro.doanchuyennganh.entity.ChiTietPhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.HoaDonDenBu;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietHoaDonDenBuId implements Serializable {
    private HoaDonDenBu hoaDonDenBu;
    private ChiTietPhieuThueTienIch chiTietPhieuThueTienIch;
}
