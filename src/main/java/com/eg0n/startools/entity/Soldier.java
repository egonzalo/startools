package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "soldiers" database table.
 * 
 */
@Entity
@Table(name="\"soldiers\"")
@NamedQuery(name="Soldier.findAll", query="SELECT s FROM Soldier s")
public class Soldier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"soldier_id\"")
	private int soldierId;

	@Column(name="\"crew_id\"")
	private int crewId;

	@Column(name="\"current_health\"")
	private int currentHealth;

	@Column(name="\"name\"")
	private String name;

	@Column(name="\"soldier_type_id\"")
	private int soldierTypeId;

	//bi-directional many-to-one association to Crew
	@ManyToOne
	@JoinColumns({
		})
	private Crew crew;

	//bi-directional many-to-many association to EquipmentType
	@ManyToMany
	@JoinTable(
		name="\"soldier_equipment\""
		, joinColumns={

			}
		, inverseJoinColumns={

			}
		)
	private List<EquipmentType> equipmentTypes;

	//bi-directional many-to-one association to SoldierType
	@ManyToOne
	@JoinColumns({
		})
	private SoldierType soldierType;

	public Soldier() {
	}

	public int getSoldierId() {
		return this.soldierId;
	}

	public void setSoldierId(int soldierId) {
		this.soldierId = soldierId;
	}

	public int getCrewId() {
		return this.crewId;
	}

	public void setCrewId(int crewId) {
		this.crewId = crewId;
	}

	public int getCurrentHealth() {
		return this.currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSoldierTypeId() {
		return this.soldierTypeId;
	}

	public void setSoldierTypeId(int soldierTypeId) {
		this.soldierTypeId = soldierTypeId;
	}

	public Crew getCrew() {
		return this.crew;
	}

	public void setCrew(Crew crew) {
		this.crew = crew;
	}

	public List<EquipmentType> getEquipmentTypes() {
		return this.equipmentTypes;
	}

	public void setEquipmentTypes(List<EquipmentType> equipmentTypes) {
		this.equipmentTypes = equipmentTypes;
	}

	public SoldierType getSoldierType() {
		return this.soldierType;
	}

	public void setSoldierType(SoldierType soldierType) {
		this.soldierType = soldierType;
	}

}