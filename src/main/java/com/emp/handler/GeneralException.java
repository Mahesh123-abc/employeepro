package com.emp.handler;

public class GeneralException extends Exception{
    private String message;
    public GeneralException(String message){
        super(message);
    }
}