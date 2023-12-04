package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Person findById(@PathVariable(value = "id") Long id) {
        return personService.findById(id);
    } 

    @RequestMapping(method = RequestMethod.POST,
    produces =  MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person person) {
        return personService.create(person);
    } 

    @RequestMapping(method = RequestMethod.PUT,
    produces =  MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public Person uptade(@RequestBody Person person) {
        return personService.uptade(person);
    } 

    @RequestMapping(value = "/{id}",
    method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id) {
        personService.delete(id);
    } 

}
