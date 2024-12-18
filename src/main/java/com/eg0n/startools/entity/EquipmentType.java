package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "equipment_types" database table.
 * 
 */
@Entity
@Table(name="\"equipment_types\"")
@NamedQuery(name="EquipmentType.findAll", query="SELECT e FROM EquipmentType e")
public class EquipmentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"equipment_type_id\"")
	private int equipmentTypeId;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"name\"")
	private String name;

	@Column(name="\"slot_type_id\"")
	private int slotTypeId;

	//bi-directional many-to-one association to Armor
	@OneToMany(mappedBy="equipmentType")
	private List<Armor> armors;

	//bi-directional many-to-many association to Character
	@ManyToMany
	@JoinTable(
		name="\"character_equipment\""
		, joinColumns={

			}
		, inverseJoinColumns={

			}
		)
	private List<Character> characters;

	//bi-directional many-to-one association to EquipmentSlot
	@ManyToOne
	@JoinColumns({
		})
	private EquipmentSlot equipmentSlot;

	//bi-directional many-to-many association to Soldier
	@ManyToMany(mappedBy="equipmentTypes")
	private List<Soldier> soldiers;

	//bi-directional many-to-one association to Weapon
	@OneToMany(mappedBy="equipmentType")
	private List<Weapon> weapons;

	public EquipmentType() {
	}

	public int getEquipmentTypeId() {
		return this.equipmentTypeId;
	}

	public void setEquipmentTypeId(int equipmentTypeId) {
		this.equipmentTypeId = equipmentTypeId;
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

	public int getSlotTypeId() {
		return this.slotTypeId;
	}

	public void setSlotTypeId(int slotTypeId) {
		this.slotTypeId = slotTypeId;
	}

	public List<Armor> getArmors() {
		return this.armors;
	}

	public void setArmors(List<Armor> armors) {
		this.armors = armors;
	}

	public Armor addArmor(Armor armor) {
		getArmors().add(armor);
		armor.setEquipmentType(this);

		return armor;
	}

	public Armor removeArmor(Armor armor) {
		getArmors().remove(armor);
		armor.setEquipmentType(null);

		return armor;
	}

	public List<Character> getCharacters() {
		return this.characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}

	public EquipmentSlot getEquipmentSlot() {
		return this.equipmentSlot;
	}

	public void setEquipmentSlot(EquipmentSlot equipmentSlot) {
		this.equipmentSlot = equipmentSlot;
	}

	public List<Soldier> getSoldiers() {
		return this.soldiers;
	}

	public void setSoldiers(List<Soldier> soldiers) {
		this.soldiers = soldiers;
	}

	public List<Weapon> getWeapons() {
		return this.weapons;
	}

	public void setWeapons(List<Weapon> weapons) {
		this.weapons = weapons;
	}

	public Weapon addWeapon(Weapon weapon) {
		getWeapons().add(weapon);
		weapon.setEquipmentType(this);

		return weapon;
	}

	public Weapon removeWeapon(Weapon weapon) {
		getWeapons().remove(weapon);
		weapon.setEquipmentType(null);

		return weapon;
	}

}