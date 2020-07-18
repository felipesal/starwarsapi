package com.felipesalles.starwarsplanetsapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipesalles.starwarsplanetsapi.domain.Planet;
import com.felipesalles.starwarsplanetsapi.repositories.PlanetRepository;

@Service
public class PlanetService {

	@Autowired
	private PlanetRepository repo;
	
	public List<Planet> findAll(){
		return repo.findAll();
	}
	
}
