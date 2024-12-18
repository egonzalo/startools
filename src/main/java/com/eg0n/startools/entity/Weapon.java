package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the "weapons" database table.
 * 
 */
@Entity
@Table(name="\"weapons\"")
@NamedQuery(name="Weapon.findAll", query="SELECT w FROM Weapon w")
public class Weapon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"weapon_id\"")
	private int weaponId;

	@Column(name="\"damage_modifier\"")
	private int damageModifier;

	@Column(name="\"equipment_type_id\"")
	private int equipmentTypeId;

	@Column(name="\"gear_slots\"")
	private int gearSlots;

	@Column(name="\"max_range\"")
	private int maxRange;

	@Column(name="\"name\"")
	private String name;

	@Column(name="\"notes\"")
	private String notes;

	//bi-directional many-to-one association to EquipmentType
	@ManyToOne
	@JoinColumns({
		})
	private EquipmentType equipmentType;

	public Weapon() {
	}

	public int getWeaponId() {
		return this.weaponId;
	}

	public void setWeaponId(int weaponId) {
		this.weaponId = weaponId;
	}

	public int getDamageModifier() {
		return this.damageModifier;
	}

	public void setDamageModifier(int damageModifier) {
		this.damageModifier = damageModifier;
	}

	public int getEquipmentTypeId() {
		return this.equipmentTypeId;
	}

	public void setEquipmentTypeId(int equipmentTypeId) {
		this.equipmentTypeId = equipmentTypeId;
	}

	public int getGearSlots() {
		return this.gearSlots;
	}

	public void setGearSlots(int gearSlots) {
		this.gearSlots = gearSlots;
	}

	public int getMaxRange() {
		return this.maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public EquipmentType getEquipmentType() {
		return this.equipmentType;
	}

	public void setEquipmentType(EquipmentType equipmentType) {
		this.equipmentType = equipmentType;
	}

}