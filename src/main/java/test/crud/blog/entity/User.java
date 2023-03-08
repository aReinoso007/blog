package test.crud.blog.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity(name = "USUARIO")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USUARIO_UID")
    private Long uid;
    @Column(name = "USUARIO_NAME")
    private String name;
    @Column(name = "USUARIO_LASTNAME")
    private String lastName;
    @Column(name = "USUARIO_USERNAME")
    private String username;
    @Column(name = "USUARIO_EMAIL")
    private String email;
    @Column(name = "USUARIO_PASSWORD")
    private String password;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Blog> blogList;

    public User() {
    }

    public User(Long uid, String name, String lastName, String username, String email, String password) {
        this.uid = uid;
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", blogList=" + blogList +
                '}';
    }
}
