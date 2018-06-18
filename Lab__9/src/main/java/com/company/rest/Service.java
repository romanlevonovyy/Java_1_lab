package com.company.rest;

import com.company.Performance;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Response;

@Path("/performances")
public class Service {
    private static Map<Integer, Performance> performanceMap = new HashMap<>();

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public final Performance getPerformance(final @PathParam("id") Integer id) {
        return performanceMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createPerformance(final Performance performance) {
        performanceMap.put(performance.getId(), performance);
        return Response.status(200).entity("Good").build();
    }

    @POST
    public final Response deletePerformance(final Performance performance) {
        performanceMap.replace(performance.getId(), performance);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response replacePerformance(final @PathParam("id") Integer id) {
        performanceMap.remove(id);
        return Response.status(200).entity("Good").build();
    }
}