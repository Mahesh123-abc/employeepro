package com.emp.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

import static org.hibernate.query.sqm.tree.SqmNode.log;

@RestControllerAdvice
public class EmployeApiHandler {
    @ExceptionHandler(GeneralException.class)
    public ResponseEntity<ResponseErrorDTO> usernameExistException(GeneralException exception){
        log.info("Entered into usernameExistException class with exception : "+ exception.getMessage());
        return new ResponseEntity<ResponseErrorDTO>(ResponseErrorDTO.builder()
                .exception_message(exception.getMessage())
                .statusCodeDescription(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase())
                .timestamp(LocalDateTime.now())
                .build(), HttpStatus.OK);
    }
}
