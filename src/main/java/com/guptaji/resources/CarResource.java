package com.guptaji.resources;

import com.guptaji.entity.Car;
import com.guptaji.util.CarUtility;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/car")
public class CarResource {

    // Here we will simply create an car entity and perform crud operations on it w/o using any DB.

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllCarsData(){
        return CarUtility.getCarData();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addACarData(Car carData){
        return CarUtility.addNewCarData(carData);
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateCarData(@PathParam("id") int id, Car carDataToBeUpdated){
        return CarUtility.updateCarData(id, carDataToBeUpdated);
    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteCarData(@PathParam("id") int id){
        return CarUtility.deleteCarData(id);
    }
}
