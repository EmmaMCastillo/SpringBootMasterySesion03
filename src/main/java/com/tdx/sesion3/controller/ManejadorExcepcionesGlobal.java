package com.tdx.sesion3.controller;

import com.tdx.sesion3.dto.ErrorApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ManejadorExcepcionesGlobal {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorApi> manejarExcepcionesValidacion (MethodArgumentNotValidException ex){
        String mensaje = ex.getBindingResult().getAllErrors().get(0).getDefaultMessage();
        ErrorApi errorApi = new ErrorApi("ENTRADA_INVALIDA", mensaje);
        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorApi);
    }
}
