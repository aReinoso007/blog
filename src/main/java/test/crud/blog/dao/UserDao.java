package test.crud.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import test.crud.blog.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

}
