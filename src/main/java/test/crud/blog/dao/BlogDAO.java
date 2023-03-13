package test.crud.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import test.crud.blog.dto.BlogDATA;
import test.crud.blog.entity.Blog;

import java.util.List;
@Repository
public interface BlogDAO extends JpaRepository<Blog, Long> {

    List<Blog> findAll();
    Blog findByUid(Long blogUID);
    List<Blog> findAllByUserUid(Long userUID);

    @Query(value = "SELECT BL.BLOG_UID AS UID, BL.BLOG_CONTENT AS contenido, BL.BLOG_CREATEDAT AS createdAt, BL.BLOG_STATUS AS status,\n" +
            "\tBL.BLOG_TITLE as title, BL.BLOG_UPDATEDAT as updatedAt, BL.USER_UID as userUID,\n" +
            "(SELECT CONCAT(USUARIO_NAME,' ',USUARIO_LASTNAME) AS author FROM USUARIO WHERE USUARIO_UID = BL.USER_UID)\n" +
            "FROM BLOG BL", nativeQuery = true)
    List<BlogDATA> getAllBlogs();
}
