package org.arpit.java2blog.SpringBootH2Example.repository;
	
	
	import org.arpit.java2blog.SpringBootH2Example.model.Movie;
	import org.springframework.data.repository.CrudRepository;
	
	public interface MovieRepository extends CrudRepository<Movie, Integer> {}