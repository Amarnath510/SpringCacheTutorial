package com.springcache.movie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	private static Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MovieDao movie = (MovieDao) context.getBean("movieDao");
		
		// Make three calls for the same resource.
		LOGGER.info("Result : {}", movie.findByDirector("Tagore"));
		
		LOGGER.info("Result : {}", movie.findByDirector("Tagore"));
		
		LOGGER.info("Result : {}", movie.findByDirector("Tagore"));
		
		
		// shutdown Spring context
		((ConfigurableApplicationContext) context).close();
	}
}
