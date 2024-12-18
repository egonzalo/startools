package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the "encounter_entries" database table.
 * 
 */
@Entity
@Table(name="\"encounter_entries\"")
@NamedQuery(name="EncounterEntry.findAll", query="SELECT e FROM EncounterEntry e")
public class EncounterEntry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"encounter_entry_id\"")
	private int encounterEntryId;

	@Column(name="\"creature_id\"")
	private int creatureId;

	@Column(name="\"encounter_table_id\"")
	private int encounterTableId;

	@Column(name="\"max_roll\"")
	private int maxRoll;

	@Column(name="\"min_roll\"")
	private int minRoll;

	@Column(name="\"quantity\"")
	private int quantity;

	//bi-directional many-to-one association to Creature
	@ManyToOne
	@JoinColumns({
		})
	private Creature creature;

	//bi-directional many-to-one association to EncounterTable
	@ManyToOne
	@JoinColumns({
		})
	private EncounterTable encounterTable;

	public EncounterEntry() {
	}

	public int getEncounterEntryId() {
		return this.encounterEntryId;
	}

	public void setEncounterEntryId(int encounterEntryId) {
		this.encounterEntryId = encounterEntryId;
	}

	public int getCreatureId() {
		return this.creatureId;
	}

	public void setCreatureId(int creatureId) {
		this.creatureId = creatureId;
	}

	public int getEncounterTableId() {
		return this.encounterTableId;
	}

	public void setEncounterTableId(int encounterTableId) {
		this.encounterTableId = encounterTableId;
	}

	public int getMaxRoll() {
		return this.maxRoll;
	}

	public void setMaxRoll(int maxRoll) {
		this.maxRoll = maxRoll;
	}

	public int getMinRoll() {
		return this.minRoll;
	}

	public void setMinRoll(int minRoll) {
		this.minRoll = minRoll;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Creature getCreature() {
		return this.creature;
	}

	public void setCreature(Creature creature) {
		this.creature = creature;
	}

	public EncounterTable getEncounterTable() {
		return this.encounterTable;
	}

	public void setEncounterTable(EncounterTable encounterTable) {
		this.encounterTable = encounterTable;
	}

}