package com.felipesalles.starwarsplanetsapi.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="movies")
public class Movie implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private String episode_id;
	
	private String title;
	
	private String release_date;

	public Movie() {
		
	}

	public Movie(String id, String episode_id, String title, String release_date) {
		this.id = id;
		this.episode_id = episode_id;
		this.title = title;
		this.release_date = release_date;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEpisode_id() {
		return episode_id;
	}

	public void setEpisode_id(String episode_id) {
		this.episode_id = episode_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((episode_id == null) ? 0 : episode_id.hashCode());
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
		Movie other = (Movie) obj;
		if (episode_id == null) {
			if (other.episode_id != null)
				return false;
		} else if (!episode_id.equals(other.episode_id))
			return false;
		return true;
	}
	
	
	
}
