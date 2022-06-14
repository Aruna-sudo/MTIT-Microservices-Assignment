package com.mtit.delivery.controller.exception.handel;

public class InternalServerErrorException extends RuntimeException {

  public InternalServerErrorException(String msg) {
    super(msg);
  }
}
