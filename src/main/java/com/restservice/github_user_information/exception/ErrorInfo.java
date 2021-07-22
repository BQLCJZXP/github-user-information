package com.restservice.github_user_information.exception;

public class ErrorInfo {

    private String message;

    public ErrorInfo(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
