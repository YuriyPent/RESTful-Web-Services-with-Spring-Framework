package ru.appsdeveloperblock.app.ws.exceptions;

public class UserServiceException extends RuntimeException{

    private static final long serialVersionUID = 145152626116L;
    
    public UserServiceException(String message){
        super(message);
    }

}
