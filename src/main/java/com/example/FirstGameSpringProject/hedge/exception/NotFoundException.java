package com.example.FirstGameSpringProject.hedge.exception;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class NotFoundException extends RuntimeException {
    public NotFoundException(String msg) {
        super(msg);
    }
}