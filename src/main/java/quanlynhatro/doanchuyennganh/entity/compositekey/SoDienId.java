package quanlynhatro.doanchuyennganh.entity.compositekey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanlynhatro.doanchuyennganh.entity.Phong;

import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoDienId  implements Serializable {
    private Date ngayNhap;
    private Phong phong;

    // Constructors, getters, setters, equals, and hashCode methods
}
