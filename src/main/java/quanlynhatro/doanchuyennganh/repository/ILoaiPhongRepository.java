package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.LoaiPhong;

@Repository
public interface ILoaiPhongRepository extends JpaRepository<LoaiPhong,Integer>{
}
