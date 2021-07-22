package com.restservice.github_user_information.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class UserExceptionHandler {

    private static final String GITHUB_USER_NOT_FOUND = "GitHub user does not found";

    @ExceptionHandler(value = HttpClientErrorException.class)
    public ResponseEntity<ErrorInfo> handleHttpClientException(HttpClientErrorException e) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

        return ResponseEntity
                .status(httpStatus)
                .body(new ErrorInfo(GITHUB_USER_NOT_FOUND));
    }


}
