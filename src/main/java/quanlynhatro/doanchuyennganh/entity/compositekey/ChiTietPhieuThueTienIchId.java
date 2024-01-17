package quanlynhatro.doanchuyennganh.entity.compositekey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import quanlynhatro.doanchuyennganh.entity.PhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.TienIch;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietPhieuThueTienIchId implements Serializable {
    private PhieuThueTienIch phieuThueTienIch;
    private TienIch tienIch;
}
