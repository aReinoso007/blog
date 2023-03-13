package test.crud.blog.definition;

import test.crud.blog.dto.BlogDATA;
import test.crud.blog.dto.BlogDTO;
import test.crud.blog.entity.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogDefinition {

    Blog savePost(BlogDTO blogDTO);
    List<Blog> getAll();
    Blog getBlogById(Long blogUid);
    List<Blog> getUserBlogsByUID(Long userUID);
    List<BlogDATA> getBlogList();
    Blog updateBlog(BlogDTO blogDTO);
}
