package quanlynhatro.doanchuyennganh.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class LoaiPhongDTO {
    private int maLoaiPhong;

    private String tenLoaiPhong;

    private int dienTich;

    private double gia;

    private int soLuong;
}
