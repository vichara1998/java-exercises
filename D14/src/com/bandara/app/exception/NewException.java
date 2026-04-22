package com.bandara.app.exception;

public class NewException extends RuntimeException{
    public NewException(String message){
        System.out.println("Error msg :"+message);
    }
}
