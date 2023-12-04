package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.services.PersonServices;

@RestController
public class PersonController {

    @Autowired
    private PersonServices personService;

    @RequestMapping(value = "/{id}",
    method = RequestMethod.GET,
    produces =  MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(value = "id") String id) {
        return personService.findById(id);
    } 

    
}
