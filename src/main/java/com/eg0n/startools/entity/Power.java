package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "powers" database table.
 * 
 */
@Entity
@Table(name="\"powers\"")
@NamedQuery(name="Power.findAll", query="SELECT p FROM Power p")
public class Power implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"power_id\"")
	private int powerId;

	@Column(name="\"activation_number\"")
	private int activationNumber;

	@Column(name="\"category_id\"")
	private int categoryId;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"name\"")
	private String name;

	@Column(name="\"strain\"")
	private int strain;

	//bi-directional many-to-one association to CharacterPower
	@OneToMany(mappedBy="power")
	private List<CharacterPower> characterPowers;

	//bi-directional many-to-many association to Background
	@ManyToMany
	@JoinTable(
		name="\"background_core_powers\""
		, joinColumns={

			}
		, inverseJoinColumns={

			}
		)
	private List<Background> backgrounds;

	//bi-directional many-to-one association to PowerCategory
	@ManyToOne
	@JoinColumns({
		})
	private PowerCategory powerCategory;

	public Power() {
	}

	public int getPowerId() {
		return this.powerId;
	}

	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}

	public int getActivationNumber() {
		return this.activationNumber;
	}

	public void setActivationNumber(int activationNumber) {
		this.activationNumber = activationNumber;
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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

	public int getStrain() {
		return this.strain;
	}

	public void setStrain(int strain) {
		this.strain = strain;
	}

	public List<CharacterPower> getCharacterPowers() {
		return this.characterPowers;
	}

	public void setCharacterPowers(List<CharacterPower> characterPowers) {
		this.characterPowers = characterPowers;
	}

	public CharacterPower addCharacterPower(CharacterPower characterPower) {
		getCharacterPowers().add(characterPower);
		characterPower.setPower(this);

		return characterPower;
	}

	public CharacterPower removeCharacterPower(CharacterPower characterPower) {
		getCharacterPowers().remove(characterPower);
		characterPower.setPower(null);

		return characterPower;
	}

	public List<Background> getBackgrounds() {
		return this.backgrounds;
	}

	public void setBackgrounds(List<Background> backgrounds) {
		this.backgrounds = backgrounds;
	}

	public PowerCategory getPowerCategory() {
		return this.powerCategory;
	}

	public void setPowerCategory(PowerCategory powerCategory) {
		this.powerCategory = powerCategory;
	}

}