package test.crud.blog.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.crud.blog.dto.UserDTO;
import test.crud.blog.entity.User;

import java.net.http.HttpResponse;

@RestController()
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/user")
public class UserController {


    @GetMapping(value = "/hola")
    public ResponseEntity<?> appInit(){
        System.out.printf("Getting rest controller");
        return ResponseEntity.status(HttpStatus.OK).body("holaa");
    }

    @PostMapping(value = "/registro")
    public ResponseEntity<?> signUp(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body("creado");
    }

    @GetMapping(value = "/login")
    public ResponseEntity<?> signIn(@RequestBody UserDTO userDTO){
        return ResponseEntity.status(HttpStatus.OK).body("exito");
    }

    @PutMapping(value = "/update_info")
    public ResponseEntity<?> updateUserInfo(@RequestBody UserDTO userDTO){
        return ResponseEntity.status(HttpStatus.OK).body("updated");
    }

}
