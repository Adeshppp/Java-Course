package com.demo.demorest;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	
	
	AlienRepository alienRepository = new AlienRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Alien> getAliens() {
		System.out.println("get Alien called");
		List<Alien> aliens = alienRepository.getAliens();
		return aliens; 
	}
	
	
	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien getAlien(@PathParam("id") int id) {
		return alienRepository.getAlien(id);
		
	}
	
	@POST
	@Path("alien")
//	@Consumes(MediaType.APPLICATION_XML)
	public Alien createAlien(Alien alien) {
		System.out.println(alien);
		alienRepository.createAlien(alien);
		return alien;
	}
	
	@PUT
	public void updateAlien(Alien alien) {
		if(alienRepository.getAlien(alien.getId()).getId() == 0) {
			alienRepository.createAlien(alien);

		}
		else {
			alienRepository.updateAlien(alien);

		}
	}
	
	@DELETE
	@Path("alien/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Alien deleteAlien(@PathParam("id") int id) {
		Alien alien= new Alien();
		if(alienRepository.getAlien(id).getId() == 0) {
			

		}
		else {
		System.out.println("deleteAlien called and id is "+id);
			alienRepository.deleteAlien(id);

		}
		
		return alien;
	}
}
