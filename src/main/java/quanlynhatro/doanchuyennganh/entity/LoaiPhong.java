package quanlynhatro.doanchuyennganh.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanlynhatro.doanchuyennganh.dto.LoaiPhongDTO;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoaiPhong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maLoaiPhong;

    private String tenLoaiPhong;

    private int dienTich;

    private double gia;

    private int soLuong;


    private String hinh;
    @OneToMany(mappedBy = "loaiPhong")
    @JsonBackReference
    private Set<Phong> phongs;

    private LoaiPhongDTO toDto() {
        return LoaiPhongDTO.builder()
                .maLoaiPhong(maLoaiPhong)
                .tenLoaiPhong(tenLoaiPhong)
                .dienTich(dienTich)
                .gia(gia)
                .soLuong(soLuong)
                .build();
    }
}
