package com.stackroute;


import org.springframework.stereotype.Component;

@Component
public class User {



  private String message;
  public  User(){

  }

  public User(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "User{" +
      "message='" + message + '\'' +
      '}';
  }


}
