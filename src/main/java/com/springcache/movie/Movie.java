package com.springcache.movie;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Movie implements Serializable {
	
	private int id;
	private String name;
	private String director;
	
	public Movie(int id, String name, String director) {
		this.id = id;
		this.name = name;
		this.director = director;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public String toString() {
		return "id = " + this.id + "; movie = " + this.name + "; director = " + this.director;
	}
}
