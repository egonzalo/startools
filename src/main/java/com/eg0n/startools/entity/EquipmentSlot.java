package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "equipment_slots" database table.
 * 
 */
@Entity
@Table(name="\"equipment_slots\"")
@NamedQuery(name="EquipmentSlot.findAll", query="SELECT e FROM EquipmentSlot e")
public class EquipmentSlot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"equipment_slot_id\"")
	private int equipmentSlotId;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"name\"")
	private String name;

	//bi-directional many-to-one association to EquipmentType
	@OneToMany(mappedBy="equipmentSlot")
	private List<EquipmentType> equipmentTypes;

	public EquipmentSlot() {
	}

	public int getEquipmentSlotId() {
		return this.equipmentSlotId;
	}

	public void setEquipmentSlotId(int equipmentSlotId) {
		this.equipmentSlotId = equipmentSlotId;
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

	public List<EquipmentType> getEquipmentTypes() {
		return this.equipmentTypes;
	}

	public void setEquipmentTypes(List<EquipmentType> equipmentTypes) {
		this.equipmentTypes = equipmentTypes;
	}

	public EquipmentType addEquipmentType(EquipmentType equipmentType) {
		getEquipmentTypes().add(equipmentType);
		equipmentType.setEquipmentSlot(this);

		return equipmentType;
	}

	public EquipmentType removeEquipmentType(EquipmentType equipmentType) {
		getEquipmentTypes().remove(equipmentType);
		equipmentType.setEquipmentSlot(null);

		return equipmentType;
	}

}