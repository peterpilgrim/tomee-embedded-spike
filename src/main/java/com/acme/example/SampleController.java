package com.acme.example;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by ppilgrim on 15-Oct-2015.
 */
@Stateless
@Path("/sample")
public class SampleController {

    @GET
    @Produces("text/plain")
    public String sample() {
        return "Hello World";
    }

}