package test.crud.blog.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import test.crud.blog.enums.BlogEnum;

import java.io.Serializable;
import java.sql.Timestamp;
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
    @Column(name = "BLOG_CONTENT", length = 1024)
    private String content;
    @Column(name = "BLOG_CREATEDAT")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "America/Guayaquil")
    private Timestamp createdAt;

    @Column(name = "BLOG_UPDATEDAT")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "America/Guayaquil")
    private Timestamp updatedAt;
    @Column(name = "BLOG_STATUS")
    @Enumerated(EnumType.STRING)
    private BlogEnum status;
    @ManyToOne
    @JoinColumn(name = "USER_UID")
    @JsonBackReference
    private User user;

    public Blog() {
    }



    public Blog(String title, String content, Timestamp createdAt, Timestamp updatedAt, User user) {
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

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BlogEnum getStatus() {
        return status;
    }

    public void setStatus(BlogEnum status) {
        this.status = status;
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
