package com.wendellyv.course.resources.exceptions;

import com.wendellyv.course.services.exceptions.DatabaseException;
import com.wendellyv.course.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFind(ResourceNotFoundException e, HttpServletRequest request) {
        String errorMessage = "Resource Not Found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError error = new StandardError(Instant.now(), status.value(), errorMessage, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(error);
    }

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request) {
        String errorMessage = "Database error";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError error = new StandardError(Instant.now(), status.value(), errorMessage, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(error);
    }
}
