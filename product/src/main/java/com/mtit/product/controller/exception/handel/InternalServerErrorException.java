package com.mtit.product.controller.exception.handel;

public class InternalServerErrorException extends RuntimeException {

  public InternalServerErrorException(String msg) {
    super(msg);
  }
}
