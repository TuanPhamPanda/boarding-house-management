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
public class LoaiTienIch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maLoaiTienIch;

    private String tenLoaiTienIch;

    @OneToMany(mappedBy = "loaiTienIch")
    @JsonBackReference
    Set<TienIch> tienIches;
}
