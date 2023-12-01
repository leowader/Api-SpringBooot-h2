package com.api.hotel.error;

import com.api.hotel.error.dto.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ResResponseEntyty extends ResponseEntityExceptionHandler {
    //clase que maneja excepciones globales
    @ExceptionHandler(HuespedNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorMessage> huespedNotFound(HuespedNotFound exception ){
        ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());//plantilla
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
}
