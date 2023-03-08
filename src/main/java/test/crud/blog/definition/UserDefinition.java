package test.crud.blog.definition;

import test.crud.blog.dto.UserDTO;
import test.crud.blog.entity.Blog;
import test.crud.blog.entity.User;

import java.util.List;

public interface UserDefinition {

    public User getUserDataByCreds(UserDTO userDTO);
    public List<Blog> getUserPosts(Long userUid);
    public User updateUserInfo(User user);


}
