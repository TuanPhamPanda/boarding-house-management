package quanlynhatro.doanchuyennganh.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int maPhong;

    @ManyToOne
    @JoinColumn(name = "maLoaiPhongF")
    private LoaiPhong loaiPhong;


    private int tang;

    private String tinhTrang;

    private boolean conTrong;

    @OneToMany(mappedBy = "phong")
    @JsonBackReference
    Set<HopDongThuePhong> hopDongThuePhongs;
}
