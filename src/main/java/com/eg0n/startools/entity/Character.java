package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "characters" database table.
 * 
 */
@Entity
@Table(name="\"characters\"")
@NamedQuery(name="Character.findAll", query="SELECT c FROM Character c")
public class Character implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"character_id\"")
	private int characterId;

	@Column(name="\"armor\"")
	private int armor;

	@Column(name="\"background_id\"")
	private int backgroundId;

	@Column(name="\"crew_id\"")
	private int crewId;

	@Column(name="\"current_health\"")
	private int currentHealth;

	@Column(name="\"fight\"")
	private int fight;

	@Column(name="\"health\"")
	private int health;

	@Column(name="\"level\"")
	private int level;

	@Column(name="\"move\"")
	private int move;

	@Column(name="\"name\"")
	private String name;

	@Column(name="\"role_id\"")
	private int roleId;

	@Column(name="\"shoot\"")
	private int shoot;

	@Column(name="\"will\"")
	private int will;

	//bi-directional many-to-one association to CharacterPower
	@OneToMany(mappedBy="character")
	private List<CharacterPower> characterPowers;

	//bi-directional many-to-one association to Background
	@ManyToOne
	@JoinColumns({
		})
	private Background background;

	//bi-directional many-to-one association to CharacterRole
	@ManyToOne
	@JoinColumns({
		})
	private CharacterRole characterRole;

	//bi-directional many-to-one association to Crew
	@ManyToOne
	@JoinColumns({
		})
	private Crew crew;

	//bi-directional many-to-many association to EquipmentType
	@ManyToMany(mappedBy="characters")
	private List<EquipmentType> equipmentTypes;

	public Character() {
	}

	public int getCharacterId() {
		return this.characterId;
	}

	public void setCharacterId(int characterId) {
		this.characterId = characterId;
	}

	public int getArmor() {
		return this.armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getBackgroundId() {
		return this.backgroundId;
	}

	public void setBackgroundId(int backgroundId) {
		this.backgroundId = backgroundId;
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

	public int getFight() {
		return this.fight;
	}

	public void setFight(int fight) {
		this.fight = fight;
	}

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMove() {
		return this.move;
	}

	public void setMove(int move) {
		this.move = move;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getShoot() {
		return this.shoot;
	}

	public void setShoot(int shoot) {
		this.shoot = shoot;
	}

	public int getWill() {
		return this.will;
	}

	public void setWill(int will) {
		this.will = will;
	}

	public List<CharacterPower> getCharacterPowers() {
		return this.characterPowers;
	}

	public void setCharacterPowers(List<CharacterPower> characterPowers) {
		this.characterPowers = characterPowers;
	}

	public CharacterPower addCharacterPower(CharacterPower characterPower) {
		getCharacterPowers().add(characterPower);
		characterPower.setCharacter(this);

		return characterPower;
	}

	public CharacterPower removeCharacterPower(CharacterPower characterPower) {
		getCharacterPowers().remove(characterPower);
		characterPower.setCharacter(null);

		return characterPower;
	}

	public Background getBackground() {
		return this.background;
	}

	public void setBackground(Background background) {
		this.background = background;
	}

	public CharacterRole getCharacterRole() {
		return this.characterRole;
	}

	public void setCharacterRole(CharacterRole characterRole) {
		this.characterRole = characterRole;
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

}