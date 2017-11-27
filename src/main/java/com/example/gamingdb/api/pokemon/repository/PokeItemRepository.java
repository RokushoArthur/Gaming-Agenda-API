package com.example.gamingdb.api.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gamingdb.api.model.pokemon.PokeItem;

public interface PokeItemRepository extends JpaRepository<PokeItem, Long>{

}
