package com.felipesalles.starwarsplanetsapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.felipesalles.starwarsplanetsapi.domain.Planet;
import com.felipesalles.starwarsplanetsapi.resources.util.URL;
import com.felipesalles.starwarsplanetsapi.services.PlanetService;

@RestController
@RequestMapping(value="/planets")
public class PlanetResources {

	@Autowired
	private PlanetService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Planet>> findAll(){
		
		List<Planet> planets = service.findAll();
		
		return ResponseEntity.ok().body(planets);
		
	}
	
	@RequestMapping(value="/{id}" , method=RequestMethod.GET)
	public ResponseEntity<Planet> findById(@PathVariable String id){
		Planet planet = service.findById(id);
		
		return ResponseEntity.ok().body(planet);
	}
	
	@RequestMapping(value="/name",method=RequestMethod.GET)
	public ResponseEntity<Planet> findByName(@RequestParam(value="name", defaultValue="") String text){
		text = URL.decodeParam(text);
		Planet planet = service.findByName(text);
		
		return ResponseEntity.ok().body(planet);
	}
	
}
