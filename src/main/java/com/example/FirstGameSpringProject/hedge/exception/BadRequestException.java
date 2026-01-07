package com.example.FirstGameSpringProject.hedge.exception;

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public class BadRequestException extends RuntimeException {
        public BadRequestException(String msg) {
            super(msg);
        }
    }
