package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "encounter_tables" database table.
 * 
 */
@Entity
@Table(name="\"encounter_tables\"")
@NamedQuery(name="EncounterTable.findAll", query="SELECT e FROM EncounterTable e")
public class EncounterTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"encounter_table_id\"")
	private int encounterTableId;

	@Column(name="\"active\"")
	private boolean active;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"name\"")
	private String name;

	//bi-directional many-to-one association to EncounterEntry
	@OneToMany(mappedBy="encounterTable")
	private List<EncounterEntry> encounterEntries;

	public EncounterTable() {
	}

	public int getEncounterTableId() {
		return this.encounterTableId;
	}

	public void setEncounterTableId(int encounterTableId) {
		this.encounterTableId = encounterTableId;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
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

	public List<EncounterEntry> getEncounterEntries() {
		return this.encounterEntries;
	}

	public void setEncounterEntries(List<EncounterEntry> encounterEntries) {
		this.encounterEntries = encounterEntries;
	}

	public EncounterEntry addEncounterEntry(EncounterEntry encounterEntry) {
		getEncounterEntries().add(encounterEntry);
		encounterEntry.setEncounterTable(this);

		return encounterEntry;
	}

	public EncounterEntry removeEncounterEntry(EncounterEntry encounterEntry) {
		getEncounterEntries().remove(encounterEntry);
		encounterEntry.setEncounterTable(null);

		return encounterEntry;
	}

}