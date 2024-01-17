package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.ChiTietHoaDonHangThang;
import quanlynhatro.doanchuyennganh.entity.compositekey.ChiTietHoaDonHangThangId;

@Repository
public interface IChiTietHoaDonHangThangRepository extends JpaRepository<ChiTietHoaDonHangThang, ChiTietHoaDonHangThangId> {
}
