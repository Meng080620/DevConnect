package com.ms.spring_security_jwt.modules.app.controller;

import com.ms.spring_security_jwt.exception.BadRequestException;
import com.ms.spring_security_jwt.exception.ConflictException;
import com.ms.spring_security_jwt.exception.InternalServerErrorException;
import com.ms.spring_security_jwt.exception.NotFoundException;
import com.ms.spring_security_jwt.infrastructure.model.response.body.BaseBodyResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler({Exception.class, InternalServerErrorException.class})
    public ResponseEntity<BaseBodyResponse> handleInternalServerErrorException(Exception ex) {
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;

        return BaseBodyResponse.failed(httpStatus, ex.getMessage());
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BaseBodyResponse> handleBadRequestException(BadRequestException ex) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

        return BaseBodyResponse.failed(httpStatus, ex.getMessage());
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<BaseBodyResponse> handleNotFoundException(NotFoundException ex) {
        HttpStatus httpStatus = HttpStatus.NOT_FOUND;

        return BaseBodyResponse.failed(httpStatus, ex.getMessage());
    }

    @ExceptionHandler(ConflictException.class)
    public ResponseEntity<BaseBodyResponse> handleConflictException(ConflictException ex) {
        HttpStatus httpStatus = HttpStatus.CONFLICT;

        return BaseBodyResponse.failed(httpStatus, ex.getMessage());
    }
}
