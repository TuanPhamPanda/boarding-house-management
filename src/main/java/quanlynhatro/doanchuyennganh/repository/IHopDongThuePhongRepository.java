package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.HopDongThuePhong;
import quanlynhatro.doanchuyennganh.entity.Phong;

@Repository
public interface IHopDongThuePhongRepository extends JpaRepository<HopDongThuePhong, Integer> {
    HopDongThuePhong findByPhong(Phong phong);
}
