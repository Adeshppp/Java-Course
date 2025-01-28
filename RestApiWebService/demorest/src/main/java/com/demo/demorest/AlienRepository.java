package com.demo.demorest;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
	List<Alien> aliens;
	public AlienRepository() {
		aliens = new ArrayList<>();
		Alien a1 = new Alien();
		a1.setId(1);
		a1.setName("Adesh");
		a1.setPoints(900);
		Alien a2 = new Alien();
		a2.setId(2);
		a2.setName("Vedika");
		a2.setPoints(100);
		aliens.add(a1);
		aliens.add(a2);
	}
	public List<Alien> getAliens() {
		return aliens;
	}

	
	

	
}
