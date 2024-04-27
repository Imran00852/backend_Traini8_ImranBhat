package com.Trani8.BackendAssignment.Exception;

import java.util.List;

public class ErrorResponse {
    private String message;
    private List<String> errors; // Add a field to hold validation errors

    public ErrorResponse(String message, List<String> errors) { // Update constructor to take both arguments
        this.message = message;
        this.errors = errors;
    }

    public String getMessage() {
        return message;
    }

    public List<String> getErrors() {
        return errors;
    }
}
