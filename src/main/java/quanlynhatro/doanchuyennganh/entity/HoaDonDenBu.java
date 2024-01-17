package quanlynhatro.doanchuyennganh.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HoaDonDenBu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maHoaDonDenBu;

    @ManyToOne
    @JoinColumn(name = "maPhieuThueF")
    private PhieuThueTienIch phieuThueTienIch;

    @ManyToOne
    @JoinColumn(name = "userNameF")
    private TaiKhoan taiKhoan;

    private Date ngayLap;

    private boolean trangThaiThanhToan;
    @OneToMany(mappedBy = "hoaDonDenBu")
    @JsonBackReference
    Set<ChiTietHoaDonDenBu> chiTietHoaDonDenBu;

}
