package test.crud.blog.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.crud.blog.dao.BlogDAO;
import test.crud.blog.dao.UserDao;
import test.crud.blog.definition.BlogDefinition;
import test.crud.blog.dto.BlogDTO;
import test.crud.blog.entity.Blog;

import java.util.Date;
import java.util.List;

@Service
public class BlogImpl implements BlogDefinition {

    @Autowired
    BlogDAO blogDAO;
    @Autowired
    UserDao userDao;

    @Override
    public Blog savePost(BlogDTO blogDTO) {
        Blog blog = new Blog();
        blog.setTitle(blogDTO.getTitle());
        blog.setContent(blogDTO.getContent());
        blog.setCreatedAt(new Date());
        blog.setUpdatedAt(new Date());
        blog.setUser(userDao.getUserByUid(blogDTO.getUserUID()));
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
}
