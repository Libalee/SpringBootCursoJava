package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundExpection extends RuntimeException{

    public ResourceNotFoundExpection(String msg) {
        super(msg);
    }
    
}
