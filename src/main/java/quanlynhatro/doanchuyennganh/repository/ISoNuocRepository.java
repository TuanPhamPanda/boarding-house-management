package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.Phong;
import quanlynhatro.doanchuyennganh.entity.SoNuoc;
import quanlynhatro.doanchuyennganh.entity.compositekey.SoNuocId;

@Repository
public interface ISoNuocRepository extends JpaRepository<SoNuoc, SoNuocId> {
    @Query("SELECT s FROM SoNuoc s WHERE s.phong =:phong and MONTH(s.ngayNhap) = :month AND YEAR(s.ngayNhap) = :year")
    SoNuoc findSoNuocByPhongMonthYear(@Param("phong") Phong phong, @Param("month") int month, @Param("year") int year);
}
