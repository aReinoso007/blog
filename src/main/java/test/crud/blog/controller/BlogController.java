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

    @PostMapping(value = "/")
    public ResponseEntity<?> savePost(@RequestBody BlogDTO blog){
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(blogService.savePost(blog));
    }

}
