package com.example.gamingdb.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gamingdb.api.model.Game;
import com.example.gamingdb.api.repository.game.GameRepositoryQuery;

/**
 * @author Arthur Gomes Araujo
 * @version 1 - 18/11/2017
 * 
 * This is for getting methods to manipulate the object on DB. <strong>JpaRepository<classname, typeOfPrimaryKey></strong>
 * grants a lot of methods like saving, deleting, selecting, etc...*/

public interface GameRepository extends JpaRepository<Game, Long>, GameRepositoryQuery{

}
