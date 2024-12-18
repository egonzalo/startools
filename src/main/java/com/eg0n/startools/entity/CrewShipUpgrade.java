package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the "crew_ship_upgrades" database table.
 * 
 */
@Entity
@Table(name="\"crew_ship_upgrades\"")
@NamedQuery(name="CrewShipUpgrade.findAll", query="SELECT c FROM CrewShipUpgrade c")
public class CrewShipUpgrade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"crew_ship_upgrade_id\"")
	private int crewShipUpgradeId;

	@Column(name="\"quantity\"")
	private int quantity;

	@Column(name="\"ship_id\"")
	private int shipId;

	@Column(name="\"ship_upgrade_id\"")
	private int shipUpgradeId;

	//bi-directional many-to-one association to CrewShip
	@ManyToOne
	@JoinColumns({
		})
	private CrewShip crewShip;

	//bi-directional many-to-one association to ShipUpgrade
	@ManyToOne
	@JoinColumns({
		})
	private ShipUpgrade shipUpgrade;

	public CrewShipUpgrade() {
	}

	public int getCrewShipUpgradeId() {
		return this.crewShipUpgradeId;
	}

	public void setCrewShipUpgradeId(int crewShipUpgradeId) {
		this.crewShipUpgradeId = crewShipUpgradeId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getShipId() {
		return this.shipId;
	}

	public void setShipId(int shipId) {
		this.shipId = shipId;
	}

	public int getShipUpgradeId() {
		return this.shipUpgradeId;
	}

	public void setShipUpgradeId(int shipUpgradeId) {
		this.shipUpgradeId = shipUpgradeId;
	}

	public CrewShip getCrewShip() {
		return this.crewShip;
	}

	public void setCrewShip(CrewShip crewShip) {
		this.crewShip = crewShip;
	}

	public ShipUpgrade getShipUpgrade() {
		return this.shipUpgrade;
	}

	public void setShipUpgrade(ShipUpgrade shipUpgrade) {
		this.shipUpgrade = shipUpgrade;
	}

}