package test.crud.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.crud.blog.dto.Credentials;
import test.crud.blog.entity.User;
import test.crud.blog.impl.UserImpl;


@RestController()
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserImpl userService;

    @GetMapping(value = "/")
    public ResponseEntity<?> getAllUsers(){
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(userService.getAllUsers());
    }

    @PostMapping(value = "/login")
    public ResponseEntity<?> signIn(@RequestBody Credentials credentials){
        User appUser = userService.getUserDataByCreds(credentials.getEmail(), credentials.getPassword());
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(appUser);
    }

    @PostMapping(value = "/registro")
    public ResponseEntity<?> signUp(@RequestBody User user){
        /*Podria usar un diccionario para poner el tipo de retorno que tengo, si es error o exito */
        final String success = "Usuario creado con exito";
        final String error = "Algo salio mal";
        return userService.saveUser(user)!= null ? ResponseEntity.status(HttpStatus.CREATED).body(success) : ResponseEntity.status(HttpStatus.CONFLICT).body(error);
    }

    @PutMapping(value = "/update_info")
    public ResponseEntity<?> updateUserInfo(@RequestBody User user){
        User appUser = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(appUser);
    }

}
