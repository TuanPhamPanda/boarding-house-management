package quanlynhatro.doanchuyennganh.dto.request;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class TaiKhoanRequestDTO {
    private String username;
    private String password;
}
