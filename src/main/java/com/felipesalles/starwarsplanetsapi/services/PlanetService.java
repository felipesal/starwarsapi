package com.felipesalles.starwarsplanetsapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipesalles.starwarsplanetsapi.domain.Planet;
import com.felipesalles.starwarsplanetsapi.repositories.PlanetRepository;
import com.felipesalles.starwarsplanetsapi.services.exception.ObjectNotFoundException;

@Service
public class PlanetService {

	@Autowired
	private PlanetRepository repo;
	
	public List<Planet> findAll(){
		return repo.findAll();
	}
	
	public Planet findById(String id) {
		Optional<Planet> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
}
