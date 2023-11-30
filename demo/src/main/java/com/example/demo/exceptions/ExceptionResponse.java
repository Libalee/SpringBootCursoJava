package com.example.demo.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private Date date;
    private String message;
    private String details;

    public ExceptionResponse(Date date, String message, String details) {
        this.date = date;
        this.message = message;
        this.details = details;
    }

    public Date getDate() {
        return date;
    }

    public String getDetails() {
        return details;
    }

    public String getMessage() {
        return message;
    }

}
