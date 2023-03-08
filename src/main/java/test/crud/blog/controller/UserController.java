package test.crud.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.crud.blog.dto.UserDTO;
import test.crud.blog.entity.Blog;
import test.crud.blog.entity.User;
import test.crud.blog.dao.UserDao;

import java.util.ArrayList;
import java.util.List;

@RestController()
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping(value = "/hola")
    public ResponseEntity<?> appInit(){
        System.out.printf("Getting rest controller");
        return ResponseEntity.status(HttpStatus.OK).body("holaa");
    }

    @PostMapping(value = "/registro")
    public ResponseEntity<?> signUp(@RequestBody User user){
        userDao.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("creado");
    }

    @GetMapping(value = "/login")
    public ResponseEntity<?> signIn(@RequestBody UserDTO userDTO){
        return ResponseEntity.status(HttpStatus.OK).body("exito");
    }

    @GetMapping(value = "/myPosts")
    public ResponseEntity<List<Blog>> getMyPosts(){
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(new ArrayList<>());
    }

    @PutMapping(value = "/update_info")
    public ResponseEntity<?> updateUserInfo(@RequestBody UserDTO userDTO){
        return ResponseEntity.status(HttpStatus.OK).body("updated");
    }

}
