package com.felipesalles.starwarsplanetsapi.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.felipesalles.starwarsplanetsapi.DTO.MovieDTO;

@Document
public class Planet implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private String name;
	
	private String climate;
	
	private String terrain;
	
	private List<MovieDTO> movies = new ArrayList<>();

	public Planet() {
		
	}

	public Planet(String id, String name, String climate, String terrain) {
		super();
		this.id = id;
		this.name = name;
		this.climate = climate;
		this.terrain = terrain;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}
	
	public List<MovieDTO> getMovies() {
		return movies;
	}

	public void setMovies(List<MovieDTO> movies) {
		this.movies = movies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planet other = (Planet) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	

}
