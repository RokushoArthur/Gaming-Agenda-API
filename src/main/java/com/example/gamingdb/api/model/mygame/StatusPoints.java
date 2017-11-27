package com.example.gamingdb.api.model.mygame;

import java.util.Random;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class StatusPoints {

	/**
	 * @author Arthur Gomes Araujo
	 * @version 1 - 18/11/2017
	 * 
	 * This class threats about status points. This is an <i>Embeddable</i> class.*/
	
	@NotNull
	private int hp;
	
	@NotNull
	private int mp;
	
	@NotNull
	private int strength;
	
	@NotNull
	private int dexterity;
	
	@NotNull
	private int intelligence;
	
	@NotNull
	private int vitality;
	
	@NotNull
	private int luck;
	
	@NotNull
	private int agility;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp + (vitality * 15);
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp + (intelligence * 10);
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}
	
	public double getPhysicalDamage(int abilityModifier) {
		double damage;
		
		if (abilityModifier == 0) {
			damage = strength * 2 + dexterity / 4;
		} else {
			damage = strength * 2 + dexterity / 4 + abilityModifier;
		}
		
		return damage;
	}
	
	public double getMagicalDamage(int abilityModifier) {
		double damage;
		
		if (abilityModifier == 0) {
			damage = intelligence * 4 + dexterity / 4;
		} else {
			damage = intelligence * 4 + dexterity / 4 + abilityModifier;
		}
		
		return damage;
	} 
	
	public double getRangedDamage(int abilityModifier) {
		double damage;
		
		if (abilityModifier == 0) {
			damage = agility / 2 + strength / 2 + dexterity;
		} else {
			damage = agility / 2 + strength / 2 + dexterity + abilityModifier;
		}
		
		return damage;
	}
	
	public double getCriticalDamage(double damage) {
		Random r = new Random();
		
		if (r.nextInt() + 1 > (luck / 2)) {
			damage += damage + luck * 2;
		}
		
		return damage;
	}
	
	public double getDefenseValue() {
		return vitality + agility / 2;
	}
	
	public double getMagicalDefenseValue() {
		return vitality / 4 + agility / 2 + intelligence;
	}
}
