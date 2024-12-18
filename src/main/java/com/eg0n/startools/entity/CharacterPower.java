package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the "character_powers" database table.
 * 
 */
@Entity
@Table(name="\"character_powers\"")
@NamedQuery(name="CharacterPower.findAll", query="SELECT c FROM CharacterPower c")
public class CharacterPower implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CharacterPowerPK id;

	@Column(name="\"activation_number\"")
	private int activationNumber;

	//bi-directional many-to-one association to Character
	@ManyToOne
	@JoinColumns({
		})
	private Character character;

	//bi-directional many-to-one association to Power
	@ManyToOne
	@JoinColumns({
		})
	private Power power;

	public CharacterPower() {
	}

	public CharacterPowerPK getId() {
		return this.id;
	}

	public void setId(CharacterPowerPK id) {
		this.id = id;
	}

	public int getActivationNumber() {
		return this.activationNumber;
	}

	public void setActivationNumber(int activationNumber) {
		this.activationNumber = activationNumber;
	}

	public Character getCharacter() {
		return this.character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public Power getPower() {
		return this.power;
	}

	public void setPower(Power power) {
		this.power = power;
	}

}