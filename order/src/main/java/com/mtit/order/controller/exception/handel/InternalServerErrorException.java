package com.mtit.order.controller.exception.handel;

public class InternalServerErrorException extends RuntimeException {

  public InternalServerErrorException(String msg) {
    super(msg);
  }
}
