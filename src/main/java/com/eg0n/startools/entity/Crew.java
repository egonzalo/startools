package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "crews" database table.
 * 
 */
@Entity
@Table(name="\"crews\"")
@NamedQuery(name="Crew.findAll", query="SELECT c FROM Crew c")
public class Crew implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"crew_id\"")
	private int crewId;

	@Column(name="\"credits\"")
	private int credits;

	@Column(name="\"experience\"")
	private int experience;

	@Column(name="\"name\"")
	private String name;

	//bi-directional many-to-one association to Character
	@OneToMany(mappedBy="crew")
	private List<Character> characters;

	//bi-directional many-to-one association to CrewShip
	@OneToMany(mappedBy="crew")
	private List<CrewShip> crewShips;

	//bi-directional many-to-one association to Soldier
	@OneToMany(mappedBy="crew")
	private List<Soldier> soldiers;

	public Crew() {
	}

	public int getCrewId() {
		return this.crewId;
	}

	public void setCrewId(int crewId) {
		this.crewId = crewId;
	}

	public int getCredits() {
		return this.credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getExperience() {
		return this.experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Character> getCharacters() {
		return this.characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}

	public Character addCharacter(Character character) {
		getCharacters().add(character);
		character.setCrew(this);

		return character;
	}

	public Character removeCharacter(Character character) {
		getCharacters().remove(character);
		character.setCrew(null);

		return character;
	}

	public List<CrewShip> getCrewShips() {
		return this.crewShips;
	}

	public void setCrewShips(List<CrewShip> crewShips) {
		this.crewShips = crewShips;
	}

	public CrewShip addCrewShip(CrewShip crewShip) {
		getCrewShips().add(crewShip);
		crewShip.setCrew(this);

		return crewShip;
	}

	public CrewShip removeCrewShip(CrewShip crewShip) {
		getCrewShips().remove(crewShip);
		crewShip.setCrew(null);

		return crewShip;
	}

	public List<Soldier> getSoldiers() {
		return this.soldiers;
	}

	public void setSoldiers(List<Soldier> soldiers) {
		this.soldiers = soldiers;
	}

	public Soldier addSoldier(Soldier soldier) {
		getSoldiers().add(soldier);
		soldier.setCrew(this);

		return soldier;
	}

	public Soldier removeSoldier(Soldier soldier) {
		getSoldiers().remove(soldier);
		soldier.setCrew(null);

		return soldier;
	}

}