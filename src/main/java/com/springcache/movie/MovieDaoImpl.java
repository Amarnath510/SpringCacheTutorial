package com.springcache.movie;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository("movieDao")
public class MovieDaoImpl implements MovieDao {
	
	// "movieFindCache" is the same name given in ehcache.xml file.
	// key = Spring Expression Language for computing the key dynamically.
	@Cacheable(value="movieFindCache", key="#name")
	@Override
	public Movie findByDirector(String name) {
		delay();
		System.out.println("Searching ... ");
		return new Movie(1, "Tagore", "Vinayak");
	}
	
	private void delay() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
