package com.alex.demorest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {

	AlienRepository repo = new AlienRepository();
	
	
	@GET
    @Produces({MediaType.APPLICATION_JSON/*, MediaType.APPLICATION_XML*/	})
	//@Produces(MediaType.APPLICATION_JSON)
	
	public List<Alien> getAliens()
	{
		return repo.getAliens();
	}
	
	
	//idealmente questo metodo si invoca con una form inviando dati
	//che andranno a riempire i campi di esemplare dell'argomento alien
	@POST
	@Path("alien")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	//@Produces(MediaType.APPLICATION_XML)
	public Alien createAlien(Alien alien)
	{
		System.out.println(alien);
		repo.create(alien);
		return alien;
	}
	
	@POST
	@Path("alien{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Alien getAlien(@PathParam("id") int id)
	{
		return repo.getAlien(id);
	}
	
}
