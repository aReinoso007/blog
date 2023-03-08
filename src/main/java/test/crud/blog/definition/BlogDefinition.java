package test.crud.blog.definition;

import test.crud.blog.entity.Blog;
import test.crud.blog.enums.BlogEnum;
import test.crud.blog.enums.StatusEnum;

import java.util.List;

public interface BlogDefinition {

    public List<Blog> getAll();
    public Blog getBlogById(Long blogUid);
    public Blog updateBlogContent(String content);
    public StatusEnum updateBlogStatus(BlogEnum blogEnum);
    public List<Blog> getUserBlogs(Long userUid);
}