package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "soldier_classes" database table.
 * 
 */
@Entity
@Table(name="\"soldier_classes\"")
@NamedQuery(name="SoldierClass.findAll", query="SELECT s FROM SoldierClass s")
public class SoldierClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"soldier_class_id\"")
	private int soldierClassId;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"name\"")
	private String name;

	//bi-directional many-to-one association to SoldierType
	@OneToMany(mappedBy="soldierClass")
	private List<SoldierType> soldierTypes;

	public SoldierClass() {
	}

	public int getSoldierClassId() {
		return this.soldierClassId;
	}

	public void setSoldierClassId(int soldierClassId) {
		this.soldierClassId = soldierClassId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SoldierType> getSoldierTypes() {
		return this.soldierTypes;
	}

	public void setSoldierTypes(List<SoldierType> soldierTypes) {
		this.soldierTypes = soldierTypes;
	}

	public SoldierType addSoldierType(SoldierType soldierType) {
		getSoldierTypes().add(soldierType);
		soldierType.setSoldierClass(this);

		return soldierType;
	}

	public SoldierType removeSoldierType(SoldierType soldierType) {
		getSoldierTypes().remove(soldierType);
		soldierType.setSoldierClass(null);

		return soldierType;
	}

}