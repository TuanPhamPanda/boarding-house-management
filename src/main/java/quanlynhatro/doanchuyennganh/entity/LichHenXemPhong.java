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
public class LichHenXemPhong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String ten;
    private String sdt;
    private String email;
    private Date ngaygioxem;
}
