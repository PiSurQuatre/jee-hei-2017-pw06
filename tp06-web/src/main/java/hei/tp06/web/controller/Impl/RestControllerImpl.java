package hei.tp06.web.controller.Impl;

import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;
import hei.tp06.core.service.Impl.EvenementServiceImpl;
import hei.tp06.web.controller.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(EvenementServiceImpl.class);

    @Inject
    private EvenementService evenemenentService;

    @GET
    @Path("/evenements")
    public List<Evenement> getEvenements()
    {
        LOGGER.debug("Requête GET sur /evenements");
        return evenemenentService.findAll();
    }

    @GET
    @Path("/evenements/{idEvent}")
    public Evenement getEvenement(@PathParam("idEvent") Long id) {
        LOGGER.debug("Requête GET sur /evenements/{idEvent}");
        return evenemenentService.findOneById(id);
    }

    @POST
    @Path("/evenements")
    @Consumes("application/json")
    public Response postEvenements(Evenement evenement) {
        LOGGER.debug("Requête POST sur /evenements");
        evenemenentService.save(evenement);
        return Response.status(201).build();

    }

    @DELETE
    @Path("/evenements/delete/{idEvent}")
    //@Consumes(value = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
    //@Consumes("application/json")
    public Response deleteEvenements(@PathParam("idEvent") Long id) {
        LOGGER.debug("Requête DELETE sur /evenements/{idEvent}");
        //J'abandonne: https://jira.spring.io/browse/SPR-14393
        if(null!=evenemenentService.findOneById(id))
            evenemenentService.delete(id);
        return Response.status(201).build();
    }


}
