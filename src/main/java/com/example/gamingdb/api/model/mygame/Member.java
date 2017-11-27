package com.example.gamingdb.api.model.mygame;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Entity
//@Table(name = "member")
public class Member {

	/**
	 * @author Arthur Gomes Araujo
	 * @version 1 - 18/11/2017
	 * 
	 * This class treats about characters that will be into your team. It has an 
	 * <i>Embedded</i> class: the <strong>StatusPoints</strong>.
	 * Also, another class that works with this one is the <strong>Inventory</strong>*/
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	
//	@NotNull
//	@Size(min = 1, max = 30)
//	private String name;
//	
//	@NotNull
//	private int level;
//	
//	@Embedded
//	@NotNull
//	private StatusPoints statusPoints;
//	
//	@Embedded
//	@NotNull
//	private Move moveset;
//	
//	@NotNull
//	private JobClass job;
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
//		Member other = (Member) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		return true;
//	}
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
//	public int getLevel() {
//		return level;
//	}
//
//	public void setLevel(int level) {
//		this.level = level;
//	}
//
//	public StatusPoints getStatusPoints() {
//		return statusPoints;
//	}
//
//	public void setStatus(StatusPoints statusPoints) {
//		this.statusPoints = statusPoints;
//	}
//
//	public Move getMoveset() {
//		return moveset;
//	}
//
//	public void setMoveset(Move moveset) {
//		this.moveset = moveset;
//	}
//
//	public JobClass getJob() {
//		return job;
//	}
//
//	public void setJob(JobClass job) {
//		this.job = job;
//	}
}
