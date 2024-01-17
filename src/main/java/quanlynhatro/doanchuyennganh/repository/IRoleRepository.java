package quanlynhatro.doanchuyennganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quanlynhatro.doanchuyennganh.entity.Role;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByTenRole(String tenRole);

    Optional<Role> findByMaRole(Integer maRole);
}
