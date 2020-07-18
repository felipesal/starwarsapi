package com.felipesalles.starwarsplanetsapi.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.felipesalles.starwarsplanetsapi.domain.Movie;
import com.felipesalles.starwarsplanetsapi.services.MovieService;

@RestController
@RequestMapping(value= "/movies")
public class MovieResources {
	
	@Autowired
	private MovieService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Movie>> findAll(){
		
		List<Movie> movies = service.findAll();
		
		return ResponseEntity.ok().body(movies);
		
	}
	
}
