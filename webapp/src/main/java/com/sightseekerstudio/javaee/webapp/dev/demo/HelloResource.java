package com.sightseekerstudio.javaee.webapp.dev.demo;

@javax.ws.rs.Path("/hello")
public class HelloResource {

  @javax.ws.rs.GET
  public String say() {
    return "hello";
  }

}
