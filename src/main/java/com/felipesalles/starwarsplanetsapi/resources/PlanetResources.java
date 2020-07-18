package com.felipesalles.starwarsplanetsapi.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.felipesalles.starwarsplanetsapi.DTO.PlanetNewDTO;
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
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> INSERT(@RequestBody PlanetNewDTO objDto){
		Planet obj = service.fromDto(objDto);
		obj = service.insert(obj);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{id}" , method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable String id){
		
		service.delete(id);
		
		return ResponseEntity.noContent().build();
	}
	
}
