package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "power_categories" database table.
 * 
 */
@Entity
@Table(name="\"power_categories\"")
@NamedQuery(name="PowerCategory.findAll", query="SELECT p FROM PowerCategory p")
public class PowerCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"power_category_id\"")
	private int powerCategoryId;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"name\"")
	private String name;

	//bi-directional many-to-one association to Power
	@OneToMany(mappedBy="powerCategory")
	private List<Power> powers;

	public PowerCategory() {
	}

	public int getPowerCategoryId() {
		return this.powerCategoryId;
	}

	public void setPowerCategoryId(int powerCategoryId) {
		this.powerCategoryId = powerCategoryId;
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

	public List<Power> getPowers() {
		return this.powers;
	}

	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}

	public Power addPower(Power power) {
		getPowers().add(power);
		power.setPowerCategory(this);

		return power;
	}

	public Power removePower(Power power) {
		getPowers().remove(power);
		power.setPowerCategory(null);

		return power;
	}

}