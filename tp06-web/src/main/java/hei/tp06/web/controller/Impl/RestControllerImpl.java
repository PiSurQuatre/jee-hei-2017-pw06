package hei.tp06.web.controller.Impl;

import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;
import hei.tp06.web.controller.RestController;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by pic on 14/02/2017.
 */
@Named
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestControllerImpl implements RestController {

    @Inject
    private EvenementService evenemenentService;

    @GET
    @Path("/evenements")
    @Override
    public List<Evenement> getEvenements()
    {
        return evenemenentService.findAll();
    }

    @GET
    @Path("/evenements/{idEvent}")
    @Override
    public Evenement getEvenement(@PathParam("idEvent") Long id) {
        return evenemenentService.findOneById(id);
    }

    @POST
    @Path("/evenements")
    @Consumes("application/json")
    @Override
    public Response postEvenements(Evenement evenement) {

        evenemenentService.save(evenement);
        return Response.status(201).build();

    }

}
