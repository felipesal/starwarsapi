package com.felipesalles.starwarsplanetsapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.felipesalles.starwarsplanetsapi.domain.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String>{

	
	
}
