package com.example.gamingdb.api.repository.game;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.gamingdb.api.model.Game;
import com.example.gamingdb.api.repository.filter.GameFilter;

public interface GameRepositoryQuery {

	public Page<Game> filter(GameFilter gameFilter, Pageable pageable);
	
}
