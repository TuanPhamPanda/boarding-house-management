package quanlynhatro.doanchuyennganh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class YeuCauSuaChua {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maYeuCau;
    private String noiDung;
    private Date ngayGioBatDau;
    private Date ngayGioKetThuc;
}
