package quanlynhatro.doanchuyennganh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanlynhatro.doanchuyennganh.entity.compositekey.SoDienId;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(SoDienId.class)
@Builder
public class SoDien {

    @Id
    private Date ngayNhap;
    private double so;
    private double donGia;

    @Id
    @ManyToOne
    @JoinColumn(name = "maPhongFPK", referencedColumnName = "maPhong")
    private Phong phong;
}
