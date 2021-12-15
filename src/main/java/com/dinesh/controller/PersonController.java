package com.dinesh.controller;

import com.dinesh.entity.Person;
import com.dinesh.repository.PersonRepository;
import liquibase.pro.packaged.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/ping")
    public ResponseEntity<String> getServerStatus() {
        return new ResponseEntity<>("pong!", HttpStatus.OK);
    }

    @PostMapping("/person/save")
    public ResponseEntity<String> savePerson(@RequestBody Person person) {
        personRepository.save(person);
        return new ResponseEntity<>("Person saved successfully", HttpStatus.OK);
    }
}
