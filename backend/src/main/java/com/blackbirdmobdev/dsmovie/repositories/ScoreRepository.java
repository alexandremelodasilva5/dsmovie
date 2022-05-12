package com.blackbirdmobdev.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blackbirdmobdev.dsmovie.entities.Score;
import com.blackbirdmobdev.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {
	
	
}
