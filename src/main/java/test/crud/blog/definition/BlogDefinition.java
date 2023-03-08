package test.crud.blog.definition;

import test.crud.blog.entity.Blog;

import java.util.List;

public interface BlogDefinition {

    List<Blog> getAll();
    Blog getBlogById(Long blogUid);
    List<Blog> getUserBlogsByUID(Long userUID);
}
