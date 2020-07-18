package com.felipesalles.starwarsplanetsapi.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.felipesalles.starwarsplanetsapi.DTO.MovieDTO;
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
		Planet p3 = new Planet(null, "Yavin IV", "temperate, tropical", "jungle, rainforests");
		Planet p4 = new Planet(null, "Hoth", "frozen", "tundra, ice caves, mountain ranges");
		Planet p5 = new Planet(null, "Dagobah", "murky", "swamp, jungles");
		Planet p6 = new Planet(null, "Bespin", "temperate", "gas giant");
		Planet p7 = new Planet(null, "Endor", "temperate", "forests, mountains, lakes");
		Planet p8 = new Planet(null, "Naboo", "temperate", "grassy hills, swamps, forests, mountains");
		Planet p9 = new Planet(null, "Coruscant", "temperate", "cityscape, mountains");
		Planet p10 = new Planet(null, "Kamino", "temperate", "ocean");
		
				
		MovieDTO mDto1 = new MovieDTO(m1);
		MovieDTO mDto2 = new MovieDTO(m2);
		MovieDTO mDto3 = new MovieDTO(m3);
		MovieDTO mDto4 = new MovieDTO(m4);
		MovieDTO mDto5 = new MovieDTO(m5);
		MovieDTO mDto6 = new MovieDTO(m6);
		
		p1.getMovies().addAll(Arrays.asList(mDto4, mDto6, mDto1, mDto2, mDto3));
		p2.getMovies().addAll(Arrays.asList(mDto4,mDto3 ));
		p3.getMovies().addAll(Arrays.asList(mDto4));
		p4.getMovies().addAll(Arrays.asList( mDto5));
		p5.getMovies().addAll(Arrays.asList(mDto3, mDto5, mDto6));
		p6.getMovies().addAll(Arrays.asList(mDto5));
		p7.getMovies().addAll(Arrays.asList(mDto6));
		p8.getMovies().addAll(Arrays.asList(mDto1, mDto2, mDto3, mDto6));
		p9.getMovies().addAll(Arrays.asList(mDto1, mDto2, mDto3, mDto6));
		p10.getMovies().addAll(Arrays.asList(mDto2));
		
		
		planetRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));
		
	}

}
