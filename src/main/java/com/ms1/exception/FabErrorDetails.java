package com.ms1.exception;

import java.util.Date;

public class FabErrorDetails {
  private Date timestamp;
  private String message;
  private String details;

  public FabErrorDetails(Date timestamp, String message, String details) {
    super();
    this.timestamp = timestamp;
    this.message = message;
    this.details = details;
  }
}