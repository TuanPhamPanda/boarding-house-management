package quanlynhatro.doanchuyennganh.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaiKhoan {
    @Id
    private String userName;

    @ManyToOne
    @JoinColumn(name = "maRoleF")
    private Role role;

    private String email;
    @JsonIgnore
    private String password;

    @OneToMany(mappedBy = "taiKhoan")
    @JsonBackReference
    Set<HopDongThuePhong> hopDongThuePhongs;

    @OneToMany(mappedBy = "taiKhoan")
    @JsonBackReference
    Set<HoaDonHangThang> hoaDonHangThangs;
}
