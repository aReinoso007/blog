package test.crud.blog.definition;

import test.crud.blog.entity.Blog;
import test.crud.blog.enums.BlogEnum;
import test.crud.blog.enums.StatusEnum;

import java.util.List;

public interface BlogDefinition {

    List<Blog> getAll();
    Blog getBlogById(Long blogUid);
    List<Blog> getUserBlogsByUID(Long userUID);
}
