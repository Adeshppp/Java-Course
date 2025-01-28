package com.demo.demorest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Alien getAlien() {
		System.out.println("get Alien called");
		Alien a = new Alien();
		a.setName("Adesh");
		a.setPoints(90);
		return a;
	}
	
}
