package com.springcache.movie;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;


@Configuration
@EnableCaching
@ComponentScan( {"com.springcache.*"} )
public class AppConfig {
	
	@Bean
	public CacheManager cacheManager() {
		return new EhCacheCacheManager(getEhCacheCacheManager().getObject());
	}
	
	@Bean
	public EhCacheManagerFactoryBean getEhCacheCacheManager() {
		EhCacheManagerFactoryBean cmfb = new EhCacheManagerFactoryBean();
		// Pass the xml file which has the cache configurations.
		cmfb.setConfigLocation(new ClassPathResource("ehcache.xml"));
		cmfb.setShared(true);
		
		return cmfb;
	}
}
