package com.example.gamingdb.api.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gamingdb.api.model.pokemon.PokemonTeam;

public interface PokemonTeamRepository extends JpaRepository<PokemonTeam, Long>{

}
