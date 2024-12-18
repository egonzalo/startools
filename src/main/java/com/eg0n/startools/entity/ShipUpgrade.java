package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "ship_upgrades" database table.
 * 
 */
@Entity
@Table(name="\"ship_upgrades\"")
@NamedQuery(name="ShipUpgrade.findAll", query="SELECT s FROM ShipUpgrade s")
public class ShipUpgrade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"ship_upgrade_id\"")
	private int shipUpgradeId;

	@Column(name="\"cost\"")
	private int cost;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"max_quantity\"")
	private int maxQuantity;

	@Column(name="\"name\"")
	private String name;

	//bi-directional many-to-one association to CrewShipUpgrade
	@OneToMany(mappedBy="shipUpgrade")
	private List<CrewShipUpgrade> crewShipUpgrades;

	public ShipUpgrade() {
	}

	public int getShipUpgradeId() {
		return this.shipUpgradeId;
	}

	public void setShipUpgradeId(int shipUpgradeId) {
		this.shipUpgradeId = shipUpgradeId;
	}

	public int getCost() {
		return this.cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMaxQuantity() {
		return this.maxQuantity;
	}

	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CrewShipUpgrade> getCrewShipUpgrades() {
		return this.crewShipUpgrades;
	}

	public void setCrewShipUpgrades(List<CrewShipUpgrade> crewShipUpgrades) {
		this.crewShipUpgrades = crewShipUpgrades;
	}

	public CrewShipUpgrade addCrewShipUpgrade(CrewShipUpgrade crewShipUpgrade) {
		getCrewShipUpgrades().add(crewShipUpgrade);
		crewShipUpgrade.setShipUpgrade(this);

		return crewShipUpgrade;
	}

	public CrewShipUpgrade removeCrewShipUpgrade(CrewShipUpgrade crewShipUpgrade) {
		getCrewShipUpgrades().remove(crewShipUpgrade);
		crewShipUpgrade.setShipUpgrade(null);

		return crewShipUpgrade;
	}

}