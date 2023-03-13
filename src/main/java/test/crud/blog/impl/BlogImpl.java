package test.crud.blog.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.crud.blog.dao.BlogDAO;
import test.crud.blog.dao.UserDao;
import test.crud.blog.definition.BlogDefinition;
import test.crud.blog.dto.BlogDATA;
import test.crud.blog.dto.BlogDTO;
import test.crud.blog.entity.Blog;
import test.crud.blog.enums.BlogEnum;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BlogImpl implements BlogDefinition {

    @Autowired
    BlogDAO blogDAO;
    @Autowired
    UserDao userDao;

    @Override
    public Blog savePost(BlogDTO blogDTO) {
        Blog blog = new Blog();
        Timestamp timestamp = new Timestamp(new Date().getTime());
        blog.setTitle(blogDTO.getTitle());
        blog.setContent(blogDTO.getContent());
        blog.setCreatedAt(timestamp);
        blog.setUpdatedAt(timestamp);
        blog.setUser(userDao.getUserByUid(blogDTO.getUserUID()));
        blog.setStatus(BlogEnum.ACTIVE);
        return blogDAO.save(blog);
    }

    @Override
    public List<Blog> getAll() {
        return blogDAO.findAll();
    }

    @Override
    public Blog getBlogById(Long blogUid) {
        return blogDAO.findByUid(blogUid);
    }

    @Override
    public List<Blog> getUserBlogsByUID(Long userUID) {
        return blogDAO.findAllByUserUid(userUID);
    }

    @Override
    public List<BlogDATA> getBlogList() {
        return blogDAO.getAllBlogs();
    }

    @Override
    public Blog updateBlog(BlogDTO blogDTO) {
        Blog blog = blogDAO.findByUid(blogDTO.getUid());
        blog.setContent(blogDTO.getContent());
        Timestamp timestamp = new Timestamp(new Date().getTime());
        blog.setUpdatedAt(timestamp);
        blog.setTitle(blogDTO.getTitle());
        return blogDAO.save(blog);
    }
}
