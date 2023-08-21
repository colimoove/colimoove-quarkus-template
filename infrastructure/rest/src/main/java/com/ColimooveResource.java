package com;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/colimoove/api/v1")
public class ColimooveResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object hello() {
        return Response
                .ok("""
                {
                "applicationName":"colimoove",
                "version":"1.0.0"
                }""")
                .build();
    }
}
