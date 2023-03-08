package test.crud.blog.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {


    @GetMapping(value = "/hola")
    public ResponseEntity<?> appInit(){
        System.out.printf("Getting rest controller");
        return new ResponseEntity<>("hola", HttpStatus.OK);
    }

}
