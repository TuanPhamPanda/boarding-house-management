package quanlynhatro.doanchuyennganh.dto.request;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Getter
@Setter
public class PhieuThueTienIchRequestDTO {
    private String username;
    private int maPhieuThue;
    private List<Integer> maTienIches;
}
