package test.crud.blog.definition;

import test.crud.blog.entity.Blog;

import java.util.List;

public interface BlogDefinition {

    public List<Blog> getAll();
    public Blog getBlogById(Long blogUid);
    public Blog updateBlog();

}
