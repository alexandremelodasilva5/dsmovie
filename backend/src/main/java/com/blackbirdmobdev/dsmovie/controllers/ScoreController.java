package com.blackbirdmobdev.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackbirdmobdev.dsmovie.dto.MovieDTO;
import com.blackbirdmobdev.dsmovie.dto.ScoreDTO;
import com.blackbirdmobdev.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value="/scores")
public class ScoreController {
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO findById(@RequestBody ScoreDTO dto){
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
	}
	
}
