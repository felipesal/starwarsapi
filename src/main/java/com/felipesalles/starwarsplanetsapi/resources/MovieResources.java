package com.felipesalles.starwarsplanetsapi.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.felipesalles.starwarsplanetsapi.domain.Movie;

@RestController
@RequestMapping(value= "/movies")
public class MovieResources {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Movie>> findAll(){
		
		List<Movie> movies = new ArrayList<>();
		
		Movie m1 = new Movie("1", "The Phantom Menace", "1999-05-19");
		Movie m2 = new Movie("2", "Attack of the Clones", "2002-05-16");
		
		movies.addAll(Arrays.asList(m1, m2));
		
		return ResponseEntity.ok().body(movies);
		
	}
	
}
