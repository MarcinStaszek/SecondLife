package pl.ms.secondLife.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ms.secondLife.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
