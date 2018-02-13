package com.neel.restfulmessenger.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by neel on 09/22/17 1:28 PM
 */

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {

  @GET
  @Path("/annotations")
  // The header param can be used to send some metadata like a session id
  public String getParamsUsingAnnotations(@MatrixParam("param") String matrixParam,
                                          @HeaderParam("customHeaderParam") String header,
                                          @CookieParam("cookieName") String cookieName) {
    return "Matrix param : " + matrixParam + "\nHeader param : " + header + "\nCookie : " + cookieName;
  }



}
