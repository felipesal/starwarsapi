package com.felipesalles.starwarsplanetsapi.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.felipesalles.starwarsplanetsapi.domain.Movie;
import com.felipesalles.starwarsplanetsapi.domain.Planet;
import com.felipesalles.starwarsplanetsapi.repositories.MovieRepository;
import com.felipesalles.starwarsplanetsapi.repositories.PlanetRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private PlanetRepository planetRepository;

	@Override
	public void run(String... args) throws Exception {
		
		movieRepository.deleteAll();
		planetRepository.deleteAll();
		
		
		Movie m1 = new Movie(null, "1", "The Phantom Menace", "1999-05-19");
		Movie m2 = new Movie(null, "2", "Attack of the Clones", "2002-05-16");
		Movie m3 = new Movie(null, "3", "Revenge of the Sith", "2005-05-19");
		Movie m4 = new Movie(null, "4", "A New Hope", "1977-05-25");
		Movie m5 = new Movie(null, "5", "The Empire Strikes Back", "1980-05-17");
		Movie m6 = new Movie(null, "6", "Return of the Jedi", "1983-05-25");
		
		movieRepository.saveAll(Arrays.asList(m1,m2,m3,m4,m5,m6));
		
		Planet p1 = new Planet(null, "Tatooine", "arid", "desert");
		Planet p2 = new Planet(null, "Alderaan", "temperate", "grasslands, mountains");
		
		planetRepository.saveAll(Arrays.asList(p1, p2));
		
	}

}
