package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the "armor" database table.
 * 
 */
@Entity
@Table(name="\"armor\"")
@NamedQuery(name="Armor.findAll", query="SELECT a FROM Armor a")
public class Armor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"armor_id\"")
	private int armorId;

	@Column(name="\"armor_modifier\"")
	private int armorModifier;

	@Column(name="\"equipment_type_id\"")
	private int equipmentTypeId;

	@Column(name="\"gear_slots\"")
	private int gearSlots;

	@Column(name="\"movement_penalty\"")
	private int movementPenalty;

	@Column(name="\"name\"")
	private String name;

	@Column(name="\"notes\"")
	private String notes;

	//bi-directional many-to-one association to EquipmentType
	@ManyToOne
	@JoinColumns({
		})
	private EquipmentType equipmentType;

	public Armor() {
	}

	public int getArmorId() {
		return this.armorId;
	}

	public void setArmorId(int armorId) {
		this.armorId = armorId;
	}

	public int getArmorModifier() {
		return this.armorModifier;
	}

	public void setArmorModifier(int armorModifier) {
		this.armorModifier = armorModifier;
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

	public int getMovementPenalty() {
		return this.movementPenalty;
	}

	public void setMovementPenalty(int movementPenalty) {
		this.movementPenalty = movementPenalty;
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