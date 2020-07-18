package com.felipesalles.starwarsplanetsapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipesalles.starwarsplanetsapi.domain.Movie;
import com.felipesalles.starwarsplanetsapi.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repo;
	
	public List<Movie> findAll(){
		return repo.findAll();
	}
	
}
