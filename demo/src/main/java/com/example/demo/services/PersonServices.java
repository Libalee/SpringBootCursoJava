package com.example.demo.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.example.demo.model.Person;

@Service
public class PersonServices {
    
    private final AtomicLong Counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id) {
        return null;
    }
}
 