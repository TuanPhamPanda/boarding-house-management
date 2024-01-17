package quanlynhatro.doanchuyennganh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanlynhatro.doanchuyennganh.entity.compositekey.ChiTietHoaDonDenBuId;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(ChiTietHoaDonDenBuId.class)
public class ChiTietHoaDonDenBu {
    @Id
    @ManyToOne
    @JoinColumn(name = "maHoaDonDenBuF")
    private HoaDonDenBu hoaDonDenBu;

    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "maPhieuThueF", referencedColumnName = "maPhieuThueF"),
            @JoinColumn(name = "maTienIchF", referencedColumnName = "maTienIchF")
    })
    private ChiTietPhieuThueTienIch chiTietPhieuThueTienIch;

    private double soTien;
    private String lyDo;
}
