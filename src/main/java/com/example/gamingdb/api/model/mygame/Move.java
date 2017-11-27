package com.example.gamingdb.api.model.mygame;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Entity
//@Table(name = "move")
public class Move {
	
	/**
	 * Note that:
	 * category = damage, healing, etc...
	 * type = ranged, melee, magical...*/

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;	
//
//	
//	@NotNull
//	@Size(min = 1, max = 100)
//	private String name;
//	
//	@NotNull
//	private String category;
//	
//	@NotNull
//	private double abilityModifier;
//	
//	@NotNull
//	private String type;
//	
//	@NotNull
//	@Size(min = 10, max = 300)
//	private String description;
//	
//	@NotNull
//	private int cost;
//	
//	@NotNull
//	private String typeOfCost;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getCategory() {
//		return category;
//	}
//
//	public void setCategory(String category) {
//		this.category = category;
//	}
//
//	public double getAbilityModifier() {
//		return abilityModifier;
//	}
//
//	public void setAbilityModifier(double abilityModifier) {
//		this.abilityModifier = abilityModifier;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public int getCost() {
//		return cost;
//	}
//
//	public void setCost(int cost) {
//		this.cost = cost;
//	}
//
//	public String getTypeOfCost() {
//		return typeOfCost;
//	}
//
//	public void setTypeOfCost(String typeOfCost) {
//		this.typeOfCost = typeOfCost;
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
//		Move other = (Move) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		return true;
//	}
}
