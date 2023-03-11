package test.crud.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.crud.blog.entity.User;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    User getUserByEmailAndPassword(String email, String password);
    User getUserByUid(Long uid);

}
