package com.guptaji.resources;

import com.guptaji.util.MobileUtility;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/mobile")
public class MobileResource {

    // important link for quarkus
    // https://quarkus.io/guides/spring-web

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getMobileList(){
        return Response.ok(MobileUtility.mobileList()).build();
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public Response addNewMobileName(String mobileName){
        return Response.ok(MobileUtility.addNewMobileName(mobileName)).build();
    }
}
