package test.crud.blog.impl;

import org.springframework.beans.factory.annotation.Autowired;
import test.crud.blog.dao.BlogDAO;
import test.crud.blog.definition.BlogDefinition;
import test.crud.blog.entity.Blog;

import java.util.List;

public class BlogImpl implements BlogDefinition {

    @Autowired
    BlogDAO blogDAO;

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
        return blogDAO.findByUserUid(userUID);
    }
}
