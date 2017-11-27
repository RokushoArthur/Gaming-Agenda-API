package com.example.gamingdb.api.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gamingdb.api.model.pokemon.PokemonAbility;

public interface PokemonAbilityRepository extends JpaRepository<PokemonAbility, Long>{

}
