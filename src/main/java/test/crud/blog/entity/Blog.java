package test.crud.blog.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import test.crud.blog.enums.BlogEnum;

import java.io.Serializable;
import java.util.Date;

@Entity(name = "BLOG")
public class Blog implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BLOG_UID")
    private long uid;
    @Column(name = "BLOG_TITLE")
    private String title;
    @Column(name = "BLOG_CONTENT")
    private String content;
    @Column(name = "BLOG_CREATEDAT")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    @Column(name = "BLOG_UPDATEDAT")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
    @Column(name = "BLOG_STATUS")
    @Enumerated(EnumType.STRING)
    private BlogEnum status;
    @ManyToOne
    @JoinColumn(name = "USER_UID")
    @JsonBackReference
    private User user;

    public Blog() {
    }



    public Blog(String title, String content, Date createdAt, Date updatedAt, User user) {
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.user = user;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "uid=" + uid +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", user=" + user +
                '}';
    }
}
