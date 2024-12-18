package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "creatures" database table.
 * 
 */
@Entity
@Table(name="\"creatures\"")
@NamedQuery(name="Creature.findAll", query="SELECT c FROM Creature c")
public class Creature implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"creature_id\"")
	private int creatureId;

	@Column(name="\"armor\"")
	private int armor;

	@Column(name="\"bounty_value\"")
	private int bountyValue;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"fight\"")
	private int fight;

	@Column(name="\"health\"")
	private int health;

	@Column(name="\"move\"")
	private int move;

	@Column(name="\"name\"")
	private String name;

	@Column(name="\"shoot\"")
	private int shoot;

	@Column(name="\"will\"")
	private int will;

	//bi-directional many-to-many association to CreatureAttribute
	@ManyToMany
	@JoinTable(
		name="\"creature_attributes_link\""
		, joinColumns={

			}
		, inverseJoinColumns={

			}
		)
	private List<CreatureAttribute> creatureAttributes;

	//bi-directional many-to-one association to EncounterEntry
	@OneToMany(mappedBy="creature")
	private List<EncounterEntry> encounterEntries;

	public Creature() {
	}

	public int getCreatureId() {
		return this.creatureId;
	}

	public void setCreatureId(int creatureId) {
		this.creatureId = creatureId;
	}

	public int getArmor() {
		return this.armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getBountyValue() {
		return this.bountyValue;
	}

	public void setBountyValue(int bountyValue) {
		this.bountyValue = bountyValue;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public List<CreatureAttribute> getCreatureAttributes() {
		return this.creatureAttributes;
	}

	public void setCreatureAttributes(List<CreatureAttribute> creatureAttributes) {
		this.creatureAttributes = creatureAttributes;
	}

	public List<EncounterEntry> getEncounterEntries() {
		return this.encounterEntries;
	}

	public void setEncounterEntries(List<EncounterEntry> encounterEntries) {
		this.encounterEntries = encounterEntries;
	}

	public EncounterEntry addEncounterEntry(EncounterEntry encounterEntry) {
		getEncounterEntries().add(encounterEntry);
		encounterEntry.setCreature(this);

		return encounterEntry;
	}

	public EncounterEntry removeEncounterEntry(EncounterEntry encounterEntry) {
		getEncounterEntries().remove(encounterEntry);
		encounterEntry.setCreature(null);

		return encounterEntry;
	}

}