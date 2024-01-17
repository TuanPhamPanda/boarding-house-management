package quanlynhatro.doanchuyennganh.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhieuThueTienIch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maPhieuThue;

    @ManyToOne
    @JoinColumn(name = "userNameF")
    private TaiKhoan taiKhoan;

    private Date ngayLap;

    @OneToMany(mappedBy = "phieuThueTienIch")
    @JsonBackReference
    Set<HoaDonDenBu> hoaDonDenBus;

    @OneToMany(mappedBy = "phieuThueTienIch")
    @JsonBackReference
    Set<ChiTietPhieuThueTienIch> chiTietPhieuThueTienIches;
}
