package com.Trani8.BackendAssignment.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class) // Handles all Exceptions
    public ResponseEntity<ErrorResponse> handleException(Exception ex) {
        String message = "An unexpected error occurred.";
        ex.printStackTrace();
        List<String> emptyErrors = new ArrayList<>();
        return ResponseEntity.internalServerError().body(new ErrorResponse(message, emptyErrors));
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(MethodArgumentNotValidException ex) {
        List<String> errors = new ArrayList<>();
        for (FieldError fieldError : ex.getFieldErrors()) {
            errors.add(fieldError.getDefaultMessage());
        }

        ErrorResponse errorResponse = new ErrorResponse("Validation failed.", errors);
        return ResponseEntity.badRequest().body(errorResponse);
    }
}
