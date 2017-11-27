package com.example.gamingdb.api.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gamingdb.api.model.pokemon.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long>{

}
