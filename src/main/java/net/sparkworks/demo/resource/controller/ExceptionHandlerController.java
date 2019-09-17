package net.sparkworks.demo.resource.controller;

import lombok.extern.slf4j.Slf4j;
import net.sparkworks.demo.resource.exception.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ExceptionHandlerController {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = {
            EntityNotFoundException.class
    })
    public String notFound(Exception e) {
        log.warn("[notFound] message:" + e.getMessage());
        return e.getMessage();
    }

}
