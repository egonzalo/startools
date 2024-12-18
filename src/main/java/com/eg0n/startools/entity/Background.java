package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "backgrounds" database table.
 * 
 */
@Entity
@Table(name="\"backgrounds\"")
@NamedQuery(name="Background.findAll", query="SELECT b FROM Background b")
public class Background implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"background_id\"")
	private int backgroundId;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"fight_mod\"")
	private int fightMod;

	@Column(name="\"health_bonus\"")
	private int healthBonus;

	@Column(name="\"health_mod\"")
	private int healthMod;

	@Column(name="\"move_mod\"")
	private int moveMod;

	@Column(name="\"name\"")
	private String name;

	@Column(name="\"shoot_mod\"")
	private int shootMod;

	@Column(name="\"stat_modifications\"")
	private String statModifications;

	@Column(name="\"will_bonus\"")
	private int willBonus;

	@Column(name="\"will_mod\"")
	private int willMod;

	//bi-directional many-to-one association to BackgroundStatChoice
	@OneToMany(mappedBy="background")
	private List<BackgroundStatChoice> backgroundStatChoices;

	//bi-directional many-to-one association to Character
	@OneToMany(mappedBy="background")
	private List<Character> characters;

	//bi-directional many-to-many association to Power
	@ManyToMany(mappedBy="backgrounds")
	private List<Power> powers;

	public Background() {
	}

	public int getBackgroundId() {
		return this.backgroundId;
	}

	public void setBackgroundId(int backgroundId) {
		this.backgroundId = backgroundId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getFightMod() {
		return this.fightMod;
	}

	public void setFightMod(int fightMod) {
		this.fightMod = fightMod;
	}

	public int getHealthBonus() {
		return this.healthBonus;
	}

	public void setHealthBonus(int healthBonus) {
		this.healthBonus = healthBonus;
	}

	public int getHealthMod() {
		return this.healthMod;
	}

	public void setHealthMod(int healthMod) {
		this.healthMod = healthMod;
	}

	public int getMoveMod() {
		return this.moveMod;
	}

	public void setMoveMod(int moveMod) {
		this.moveMod = moveMod;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShootMod() {
		return this.shootMod;
	}

	public void setShootMod(int shootMod) {
		this.shootMod = shootMod;
	}

	public String getStatModifications() {
		return this.statModifications;
	}

	public void setStatModifications(String statModifications) {
		this.statModifications = statModifications;
	}

	public int getWillBonus() {
		return this.willBonus;
	}

	public void setWillBonus(int willBonus) {
		this.willBonus = willBonus;
	}

	public int getWillMod() {
		return this.willMod;
	}

	public void setWillMod(int willMod) {
		this.willMod = willMod;
	}

	public List<BackgroundStatChoice> getBackgroundStatChoices() {
		return this.backgroundStatChoices;
	}

	public void setBackgroundStatChoices(List<BackgroundStatChoice> backgroundStatChoices) {
		this.backgroundStatChoices = backgroundStatChoices;
	}

	public BackgroundStatChoice addBackgroundStatChoice(BackgroundStatChoice backgroundStatChoice) {
		getBackgroundStatChoices().add(backgroundStatChoice);
		backgroundStatChoice.setBackground(this);

		return backgroundStatChoice;
	}

	public BackgroundStatChoice removeBackgroundStatChoice(BackgroundStatChoice backgroundStatChoice) {
		getBackgroundStatChoices().remove(backgroundStatChoice);
		backgroundStatChoice.setBackground(null);

		return backgroundStatChoice;
	}

	public List<Character> getCharacters() {
		return this.characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}

	public Character addCharacter(Character character) {
		getCharacters().add(character);
		character.setBackground(this);

		return character;
	}

	public Character removeCharacter(Character character) {
		getCharacters().remove(character);
		character.setBackground(null);

		return character;
	}

	public List<Power> getPowers() {
		return this.powers;
	}

	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}

}