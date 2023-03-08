package test.crud.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import test.crud.blog.entity.Blog;

import java.util.List;
@Repository
public interface BlogDAO extends JpaRepository<Blog, Long> {

    List<Blog> findAll();
    Blog findByUid(Long blogUID);
    List<Blog> findByUserUid(Long userUID);
}
