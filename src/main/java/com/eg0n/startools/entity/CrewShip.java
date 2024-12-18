package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "crew_ships" database table.
 * 
 */
@Entity
@Table(name="\"crew_ships\"")
@NamedQuery(name="CrewShip.findAll", query="SELECT c FROM CrewShip c")
public class CrewShip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"ship_id\"")
	private int shipId;

	@Column(name="\"crew_id\"")
	private int crewId;

	@Column(name="\"name\"")
	private String name;

	//bi-directional many-to-one association to CrewShipUpgrade
	@OneToMany(mappedBy="crewShip")
	private List<CrewShipUpgrade> crewShipUpgrades;

	//bi-directional many-to-one association to Crew
	@ManyToOne
	@JoinColumns({
		})
	private Crew crew;

	public CrewShip() {
	}

	public int getShipId() {
		return this.shipId;
	}

	public void setShipId(int shipId) {
		this.shipId = shipId;
	}

	public int getCrewId() {
		return this.crewId;
	}

	public void setCrewId(int crewId) {
		this.crewId = crewId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CrewShipUpgrade> getCrewShipUpgrades() {
		return this.crewShipUpgrades;
	}

	public void setCrewShipUpgrades(List<CrewShipUpgrade> crewShipUpgrades) {
		this.crewShipUpgrades = crewShipUpgrades;
	}

	public CrewShipUpgrade addCrewShipUpgrade(CrewShipUpgrade crewShipUpgrade) {
		getCrewShipUpgrades().add(crewShipUpgrade);
		crewShipUpgrade.setCrewShip(this);

		return crewShipUpgrade;
	}

	public CrewShipUpgrade removeCrewShipUpgrade(CrewShipUpgrade crewShipUpgrade) {
		getCrewShipUpgrades().remove(crewShipUpgrade);
		crewShipUpgrade.setCrewShip(null);

		return crewShipUpgrade;
	}

	public Crew getCrew() {
		return this.crew;
	}

	public void setCrew(Crew crew) {
		this.crew = crew;
	}

}