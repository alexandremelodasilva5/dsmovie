package com.blackbirdmobdev.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blackbirdmobdev.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	
}
