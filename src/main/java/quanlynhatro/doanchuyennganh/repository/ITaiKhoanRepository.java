package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.TaiKhoan;

import java.util.Optional;

@Repository
public interface ITaiKhoanRepository extends JpaRepository<TaiKhoan, String> {
    //@Query('SELECT u FROM TaiKhoan WHERE userName = username')
    Optional<TaiKhoan> findByUserName(String username);

    Boolean existsByEmail(String email);

    Optional<TaiKhoan> findByUserNameOrEmail(String username, String email);

    boolean existsByUserName(String username);
}
