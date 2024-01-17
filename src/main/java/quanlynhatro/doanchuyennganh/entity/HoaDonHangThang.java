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
public class HoaDonHangThang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maHoaDonHangThang;

    @ManyToOne
    @JoinColumn(name = "maHopDongF")
    private HopDongThuePhong hopDongThuePhong;

    @ManyToOne
    @JoinColumn(name = "userNameF")
    private TaiKhoan taiKhoan;

    private Date ngayLap;
    private boolean trangThaiThanhToan;
    private double soTien;

    @OneToMany(mappedBy = "hoaDonHangThang")
    @JsonBackReference
    Set<ChiTietHoaDonHangThang> chiTietHoaDonHangThangs;

}
