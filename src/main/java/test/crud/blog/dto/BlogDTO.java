package test.crud.blog.dto;

import test.crud.blog.entity.Blog;

import java.io.Serializable;

public class BlogDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long uid;
    private String title;
    private String content;
    private Long userUID;

    public BlogDTO(Blog blog){
        super();
        this.title = blog.getTitle();
        this.content = blog.getContent();
        this.userUID = blog.getUser().getUid();
    }

    public BlogDTO(String title, String content, Long userUID) {
        this.title = title;
        this.content = content;
        this.userUID = userUID;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
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

    public Long getUserUID() {
        return userUID;
    }

    public void setUserUID(Long userUID) {
        this.userUID = userUID;
    }
}
