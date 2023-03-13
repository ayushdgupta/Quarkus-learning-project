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

    // Here we are simply taking a list of String and performing a crud operations on it w/o using any Object & DB.

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

    @PUT
    @Path("/{oldMobileName}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response updateMobileName(@PathParam("oldMobileName") String oldName, @QueryParam("newMobileName") String newName){
        return Response.ok(MobileUtility.updateMobileName(oldName, newName)).build();
    }

    @DELETE
    @Path("/{mobileName}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response deleteMobileNumber(@PathParam("mobileName") String mobileNameToBeDeleted){
        return MobileUtility.deleteMobileNumber(mobileNameToBeDeleted);
    }
}
