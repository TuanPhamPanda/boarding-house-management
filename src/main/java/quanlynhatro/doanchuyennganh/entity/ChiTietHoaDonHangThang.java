package quanlynhatro.doanchuyennganh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanlynhatro.doanchuyennganh.entity.compositekey.ChiTietHoaDonHangThangId;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(ChiTietHoaDonHangThangId.class)
public class ChiTietHoaDonHangThang {
    @Id
    @ManyToOne
    @JoinColumn(name = "maHoaDonHangThangF")
    private HoaDonHangThang hoaDonHangThang;

    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "maPhieuThueF", referencedColumnName = "maPhieuThueF"),
            @JoinColumn(name = "maTienIchF", referencedColumnName = "maTienIchF")
    })
    private ChiTietPhieuThueTienIch chiTietPhieuThueTienIch;
}
