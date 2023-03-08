package test.crud.blog.definition;

import test.crud.blog.dto.UserDTO;
import test.crud.blog.entity.Blog;
import test.crud.blog.entity.User;

import java.util.List;

public interface UserDefinition {

    public User getUserDataByCreds(UserDTO userDTO);
    public User updateUserInfo(User user);
    public User getUserInfo(Long uid);

}
