package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.LoaiPhong;
import quanlynhatro.doanchuyennganh.entity.LoaiTienIch;
@Repository
public interface ILoaiTienIchRepository extends JpaRepository<LoaiTienIch, Integer> {
}
