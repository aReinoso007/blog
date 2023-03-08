package test.crud.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import test.crud.blog.entity.Blog;

public interface BlogDAO extends JpaRepository<Blog, Long> {
    
}
