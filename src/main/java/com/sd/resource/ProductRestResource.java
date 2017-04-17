package com.sd.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;

@Component
@Path("/products")
public class ProductRestResource {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public Response findAllPublicProducts() {
		return Response.status(Status.OK).entity("{\"message\":\"Public products list\"}").build();
	}

	@GET
	@Path("/secure")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public Response findAllPrivateProducts() {
		return Response.status(Status.OK).entity("{\"message\":\"Secured products list\"}").build();
	}

}
