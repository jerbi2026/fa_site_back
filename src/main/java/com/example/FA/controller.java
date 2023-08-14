package com.example.FA;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")
public class controller {
    private final service service;


    public controller(com.example.FA.service service) {
        this.service = service;
    }
    @GetMapping("/v1")
    public ResponseEntity<List<contact>> get_contact(){
        List<contact> contacts = service.affiche_contacts();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }
    @PostMapping("/v2")
    public void ajout_contact(@RequestBody contact c){
        service.ajout_contact(c);

    }

    @DeleteMapping("/v3/{email}")
    public void delete_contact(@PathVariable String email){
        service.delete_contact(email);
    }

}
