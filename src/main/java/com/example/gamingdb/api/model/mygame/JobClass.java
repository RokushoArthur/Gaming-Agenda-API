package com.example.gamingdb.api.model.mygame;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author Arthur Gomes Araujo
 * @version 1 - 18/11/2017
 * 
 * This class treats only about job classes I have created for my own personal game.
 * 
 * Based on the system, this class can offer a name and bonuses. Also, this 
 * class will offer a skill tree that the can learn.*/

//@Entity
//@Table(name = "job")
public class JobClass {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	public Long id;
//	
//	@NotNull
//	private String name;
//	
//	private double hpBonus;
//	private double mpBonus;
//	private double strengthBonus;
//	private double agilityBonus;
//	private double vitalityBonus;
//	private double dexterityBonus;
//	private double luckBonus;
//	private double intelligenceBonus;
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getHpBonus() {
//		return hpBonus;
//	}
//	public void setHpBonus(double hpBonus) {
//		this.hpBonus = hpBonus;
//	}
//	public double getMpBonus() {
//		return mpBonus;
//	}
//	public void setMpBonus(double mpBonus) {
//		this.mpBonus = mpBonus;
//	}
//	public double getStrengthBonus() {
//		return strengthBonus;
//	}
//	public void setStrengthBonus(double strengthBonus) {
//		this.strengthBonus = strengthBonus;
//	}
//	public double getAgilityBonus() {
//		return agilityBonus;
//	}
//	public void setAgilityBonus(double agilityBonus) {
//		this.agilityBonus = agilityBonus;
//	}
//	public double getVitalityBonus() {
//		return vitalityBonus;
//	}
//	public void setVitalityBonus(double vitalityBonus) {
//		this.vitalityBonus = vitalityBonus;
//	}
//	public double getDexterityBonus() {
//		return dexterityBonus;
//	}
//	public void setDexterityBonus(double dexterityBonus) {
//		this.dexterityBonus = dexterityBonus;
//	}
//	public double getLuckBonus() {
//		return luckBonus;
//	}
//	public void setLuckBonus(double luckBonus) {
//		this.luckBonus = luckBonus;
//	}
//	public double getIntelligenceBonus() {
//		return intelligenceBonus;
//	}
//	public void setIntelligenceBonus(double intelligenceBonus) {
//		this.intelligenceBonus = intelligenceBonus;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		JobClass other = (JobClass) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		return true;
//	}
}
