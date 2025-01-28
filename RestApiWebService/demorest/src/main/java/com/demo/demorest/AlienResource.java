package com.demo.demorest;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens() {
		System.out.println("get Alien called");
		AlienRepository alienRepository= new AlienRepository();
		List<Alien> aliens = alienRepository.getAliens();
		return aliens; 
	}
}
