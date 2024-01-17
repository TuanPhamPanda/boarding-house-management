package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.PhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.TaiKhoan;

import java.util.List;

@Repository
public interface IPhieuThueTienIchRepository extends JpaRepository<PhieuThueTienIch, Integer> {
    List<PhieuThueTienIch> findByTaiKhoan(TaiKhoan taiKhoan);

}
