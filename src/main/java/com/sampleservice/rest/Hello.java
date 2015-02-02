package com.sampleservice.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

// Plain old Java Object it does not extend as class or implements 
// an interface

// The class registers its methods for the HTTP GET request using the @GET annotation. 
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML. 

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /

//http://localhost:8080/RESTfulWebService/rest/hello/Zakeer

@Path("/hello")
public class Hello {

  // This method is called if TEXT_PLAIN is request
  @GET
  @Path("/{param}")
  public Response getMsg(@PathParam("param") String msg) {
 
    String output = "Jersey say : " + msg;
 
    return Response.status(200).entity(output).build();
 
  }

} 
