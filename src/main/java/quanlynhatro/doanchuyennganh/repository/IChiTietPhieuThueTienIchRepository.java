package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.ChiTietPhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.PhieuThueTienIch;
import quanlynhatro.doanchuyennganh.entity.compositekey.ChiTietPhieuThueTienIchId;

import java.util.List;

@Repository
public interface IChiTietPhieuThueTienIchRepository extends JpaRepository<ChiTietPhieuThueTienIch, ChiTietPhieuThueTienIchId> {

    // May query ma entity co field ko can viet lai query a oke
    // Delete voi update can transaction
    void deleteByPhieuThueTienIch(PhieuThueTienIch phieuThueTienIch);

    List<ChiTietPhieuThueTienIch> findByPhieuThueTienIch(PhieuThueTienIch phieuThueTienIch);

}
