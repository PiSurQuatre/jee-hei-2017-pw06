package hei.tp06.web.controller;

import hei.tp06.core.entity.Evenement;
import org.springframework.web.bind.annotation.PathVariable;

import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Named
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface RestController {

}
