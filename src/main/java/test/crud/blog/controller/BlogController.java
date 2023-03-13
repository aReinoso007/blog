package test.crud.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.crud.blog.dto.BlogDTO;
import test.crud.blog.entity.Blog;
import test.crud.blog.impl.BlogImpl;

import java.util.Date;
import java.util.Optional;

@RestController()
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/posts")
public class BlogController {

    @Autowired
    private BlogImpl blogService;

    @GetMapping(value = "/")
    public ResponseEntity<?> getAllPosts(){
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(blogService.getAll());
    }

    @GetMapping(value = "/{id}")
    public Optional<Blog> getBlogById(@PathVariable("id") long id){
        return blogService.getBlogById(id);
    }

    @GetMapping(value = "/all")
    public ResponseEntity<?> getAllBlogs(){
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(blogService.getBlogList());
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> savePost(@RequestBody BlogDTO blog){
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(blogService.savePost(blog));
    }

    @PutMapping(value = "/update")
    public ResponseEntity<?> updatePost(@RequestBody Blog blog){
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body("");
    }

}
