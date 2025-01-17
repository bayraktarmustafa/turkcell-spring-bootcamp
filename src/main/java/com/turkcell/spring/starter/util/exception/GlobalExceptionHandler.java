package com.turkcell.spring.starter.util.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler
{
  @ExceptionHandler({Exception.class})
  public String handleException(Exception e) {
    // e
    return "Bilinmeyen hata";
  }

  @ExceptionHandler({RuntimeException.class})
  public String handleRuntimeException(RuntimeException e) {
    return e.getMessage();
  }

  @ExceptionHandler({MethodArgumentNotValidException.class})
  public String handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
    return "Validasyon hatası.";
  }
  // MethodArgumentEx.
}
