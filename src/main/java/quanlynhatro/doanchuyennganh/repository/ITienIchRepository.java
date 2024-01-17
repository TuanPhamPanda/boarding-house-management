package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.TienIch;
@Repository
public interface ITienIchRepository extends JpaRepository<TienIch, Integer> {
}
