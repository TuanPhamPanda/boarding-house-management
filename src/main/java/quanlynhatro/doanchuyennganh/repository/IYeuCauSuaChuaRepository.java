package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.YeuCauSuaChua;

@Repository
public interface IYeuCauSuaChuaRepository extends JpaRepository<YeuCauSuaChua, Integer> {
}
