package com.example.gamingdb.api.model.mygame;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

//@Entity
//@Table(name = "team")
public class Team {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	
//	@NotNull
//	private String typeOfTeam;
//	
//	@NotNull
//	@Embedded
//	private List<Member> characters;
//	
//	@Embedded
//	@NotNull
//	private Game game;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getTypeOfTeam() {
//		return typeOfTeam;
//	}
//
//	public void setTypeOfTeam(String typeOfTeam) {
//		this.typeOfTeam = typeOfTeam;
//	}
//
//	public List<Member> getCharacters() {
//		return characters;
//	}
//
//	public void setCharacters(List<Member> characters) {
//		this.characters = characters;
//	}
//
//	public Game getGame() {
//		return game;
//	}
//
//	public void setGame(Game game) {
//		this.game = game;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Team other = (Team) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		return true;
//	}
}
