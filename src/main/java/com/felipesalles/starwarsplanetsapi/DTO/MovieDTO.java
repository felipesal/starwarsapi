package com.felipesalles.starwarsplanetsapi.DTO;

import java.io.Serializable;

import com.felipesalles.starwarsplanetsapi.domain.Movie;

public class MovieDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private String title;

	public MovieDTO() {
		
	}

	public MovieDTO(Movie movie) {
		this.title = movie.getTitle();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
