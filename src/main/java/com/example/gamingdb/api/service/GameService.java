package com.example.gamingdb.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.gamingdb.api.model.Game;
import com.example.gamingdb.api.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public Game update(Long id, Game game) {
		Game savedGame = searchGameById(id);
		
		BeanUtils.copyProperties(game, savedGame, "id");
		
		return gameRepository.save(savedGame);
	}
	
	private Game searchGameById(Long id) {
		Game savedGame = gameRepository.findOne(id);
		
		if (savedGame == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		return savedGame;
	}
	
	public void updateGenre(Long id, String genre) {
		Game savedGame = searchGameById(id);
		
		savedGame.setGenre(genre);
		gameRepository.save(savedGame);
	}
	
	public void updatePlataform(Long id, String plataform) {
		Game savedGame = searchGameById(id);
		
		savedGame.setPlataform(plataform);
		gameRepository.save(savedGame);
	}
}
