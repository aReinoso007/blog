package test.crud.blog.dto;

import test.crud.blog.entity.User;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long uid;
    private String name;
    private String lastName;
    private String username;
    private String email;
    private String password;

    public UserDTO(User user){
        super();
        this.uid = user.getUid();
        this.name = user.getName();
        this.lastName = user.getLastName();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }
}
