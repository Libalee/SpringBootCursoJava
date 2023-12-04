package com.example.demo.services;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.ResourceNotFoundExpection;
import com.example.demo.model.Person;
import com.example.demo.repositoreies.PersonRepositories;

@Service
public class PersonServices {
    
    private final AtomicLong Counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepositories repositories;

    public Person findById(Long id) {

        logger.info("Finding one person.");

        return repositories.findById(id).orElseThrow(() -> new ResourceNotFoundExpection("No records found for this id"));
    }

    public List<Person> findAll() {

        logger.info("Fiding all people.");

        return repositories.findAll();
    }

    public Person create(Person person) {

        logger.info("Creating one person.");

        return repositories.save(person);
    }

    public Person uptade(Person person){

        logger.info("Updating one person.");

        Person entity = repositories.findById(person.getId())
        .orElseThrow(() -> new ResourceNotFoundExpection("No records found for this id"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());

        return repositories.save(person);
    }

    public void delete(Long id) {

        logger.info("Deleting one person.");
        
        Person entity = repositories.findById(id)
        .orElseThrow(() -> new ResourceNotFoundExpection("No records found for this id"));

        repositories.delete(entity);
    }
}
 