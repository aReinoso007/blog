package test.crud.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.crud.blog.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
