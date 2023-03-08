package test.crud.blog.definition;
import test.crud.blog.entity.User;


public interface UserDefinition {

    public User getUserDataByCreds(String email, String password);
    public User updateUserInfo(User user);
    public User getUserInfo(Long uid);

}
