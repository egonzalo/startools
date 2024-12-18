package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "creature_attributes" database table.
 * 
 */
@Entity
@Table(name="\"creature_attributes\"")
@NamedQuery(name="CreatureAttribute.findAll", query="SELECT c FROM CreatureAttribute c")
public class CreatureAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"attribute_id\"")
	private int attributeId;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"name\"")
	private String name;

	//bi-directional many-to-many association to Creature
	@ManyToMany(mappedBy="creatureAttributes")
	private List<Creature> creatures;

	public CreatureAttribute() {
	}

	public int getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
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

	public List<Creature> getCreatures() {
		return this.creatures;
	}

	public void setCreatures(List<Creature> creatures) {
		this.creatures = creatures;
	}

}