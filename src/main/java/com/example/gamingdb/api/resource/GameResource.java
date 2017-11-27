package com.example.gamingdb.api.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.gamingdb.api.event.CreatedResourceEvent;
import com.example.gamingdb.api.model.Game;
import com.example.gamingdb.api.repository.GameRepository;
import com.example.gamingdb.api.repository.filter.GameFilter;
import com.example.gamingdb.api.service.GameService;

@RestController
@RequestMapping("/games")
public class GameResource {
	
	/**
	 * @author Arthur Gomes Araujo
	 * @version 1 - 18/11/2017
	 * 
	 * Because this class is a controller (it will manipulate the
	 * class <strong>Game</strong>, it will need the annotation
	 * RestController. ALso, this needs the annotation
	 * RequestMapping("/games") to control the URL. */
	
	@Autowired
	private GameRepository gameRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public Page<Game> searchByFilter(GameFilter gameFilter, Pageable pageable) {
		return gameRepository.filter(gameFilter, pageable);
	}
	
	@GetMapping("/all")
	public List<Game> searchAllGames() {
		return gameRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> searchGameById(@PathVariable Long id) {
		Game game = gameRepository.findOne(id);
		
		return game == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(game);
	}
	
	@PostMapping
	public ResponseEntity<Game> saveNewGame(@Valid @RequestBody Game game, HttpServletResponse response) {
		Game savedGame = gameRepository.save(game);
		
		publisher.publishEvent(new CreatedResourceEvent(this, response, savedGame.getId()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(savedGame);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteGameById(@PathVariable Long id) {
		gameRepository.delete(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Game> updateGameById(@PathVariable Long id, @Valid @RequestBody Game game) {
		Game savedGame = gameService.update(id, game);
		
		return ResponseEntity.ok(savedGame);
	}
	
	@PutMapping("/{id}/genre")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateGenre(@PathVariable Long id, @RequestBody String genre) {
		gameService.updateGenre(id, genre);
	}
	
	@PutMapping("/{id}/plataform")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updatePlataform(@PathVariable Long id, @RequestBody String plataform) {
		gameService.updatePlataform(id, plataform);
	}
}
