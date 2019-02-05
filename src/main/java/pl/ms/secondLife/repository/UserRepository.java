package pl.ms.secondLife.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.ms.secondLife.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}