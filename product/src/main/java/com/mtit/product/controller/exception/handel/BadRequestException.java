package com.mtit.product.controller.exception.handel;

public class BadRequestException extends RuntimeException {

  public BadRequestException(String msg) {
    super(msg);
  }
}
