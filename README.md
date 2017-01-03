# Spring Caching Tutorial using EhCache.


- **Project Setup:**
  - Eclipse -> File -> New -> Spring Legacy Project -> Simple Spring Maven and "Give Project Name" -> Finish.
  - For Spring Tool Suite setup in Eclipse visit [this](http://www.eclipse.org/webtools/jst/components/ws/1.5/tutorials/InstallTomcat/InstallTomcat.html).

- **Add Caching dependencies in pom.xml**

  We will add the following dependencies in pom file,
  - ehcache
  - spring-context 
  - spring-context-support

- **Classes/Interfaces and xml files**

  We have following classes/inferfaces.
  - `Movie` POJO which has attributes id, name, director.
  - `MovieDao` interface which has `findByDirector` method.
  - `MovieDaoImpl` which implements the MovieDao interface.
  - `AppConfig` class has the EhCache configuration manager details.
  - `App` class which acts as main class.
  - `ehcache.xml` file under resources which has all the required configurations for Caching.
    
- **Implementation Details**  
  - From App.java we are making calls to `findByMethod` of MovieDaoImpl class.
  - But only for the first call the method executes and for the remaining calls it will return the output value which it stored in the cache.
    This is achieved by making the method annotated with `@Cacheable` and passing `value="movieFindCache"` which we have declared in `ehcache.xml` file.
  - Add the Caching related configuration in ehcache.xml file.
  
- **Run**
  - Run App.java file to check the results.

- **Credits**
  - [Spring Caching and Ehcache example](https://www.mkyong.com/spring/spring-caching-and-ehcache-example/)
  - [Spring Cache Tutorial](http://javabeat.net/spring-cache/)
