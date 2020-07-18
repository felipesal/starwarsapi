package com.felipesalles.starwarsplanetsapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.felipesalles.starwarsplanetsapi.domain.Planet;

@Repository
public interface PlanetRepository extends MongoRepository<Planet, String>{

	
	
}
