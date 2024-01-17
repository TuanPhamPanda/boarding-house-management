package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.Phong;
import quanlynhatro.doanchuyennganh.entity.SoDien;
import quanlynhatro.doanchuyennganh.entity.compositekey.SoDienId;

@Repository
public interface ISoDienRepository extends JpaRepository<SoDien, SoDienId> {
    @Query("SELECT s FROM SoDien s WHERE s.phong =:phong and MONTH(s.ngayNhap) = :month AND YEAR(s.ngayNhap) = :year")
    SoDien findSoDienByPhongMonthYear(@Param("phong") Phong phong, @Param("month") int month, @Param("year") int year);

}
