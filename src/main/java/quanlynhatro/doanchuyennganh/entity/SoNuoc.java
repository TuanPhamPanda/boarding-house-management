package quanlynhatro.doanchuyennganh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanlynhatro.doanchuyennganh.entity.compositekey.SoNuocId;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(SoNuocId.class)
@Builder
public class SoNuoc {
    @Id
    private Date ngayNhap;
    private double so;
    private double donGia;

    @Id
    @ManyToOne
    @JoinColumn(name = "maPhongFPK")
    private Phong phong;
}
