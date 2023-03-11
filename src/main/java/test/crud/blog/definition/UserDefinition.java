package test.crud.blog.definition;
import test.crud.blog.entity.User;

import java.util.List;


public interface UserDefinition {
    User saveUser(User user);
    User getUserDataByCreds(String email, String password);
    User updateUserInfo(User user);
    User getUserInfo(Long uid);
    List<User> getAllUsers();

}
