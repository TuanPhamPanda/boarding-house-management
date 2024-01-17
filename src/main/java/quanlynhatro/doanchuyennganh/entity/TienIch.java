package quanlynhatro.doanchuyennganh.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TienIch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maTienIch;

    @ManyToOne
    @JoinColumn(name = "maLoaiTienIchF")
    private LoaiTienIch loaiTienIch;

    private String tenTienIch;

    private double gia;

    private String tinhTrang;

    private boolean coSan;

    @OneToMany(mappedBy = "tienIch")
    @JsonBackReference
    Set<ChiTietPhieuThueTienIch> chiTietPhieuThueTienIches;
}
