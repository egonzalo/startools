/*
 * Created on 2025-01-20 ( 17:03:22 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.eg0n.startools.telosys.persistence.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * JPA entity class for "CrewShipUpgrades"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="crew_ship_upgrades", schema="stargrave" )
public class CrewShipUpgrades implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="crew_ship_upgrade_id", nullable=false)
    private int        crewShipUpgradeId ;

    //--- OTHER DATA FIELDS 
    @Column(name="ship_id")
    private Integer    shipId ;

    @Column(name="ship_upgrade_id")
    private Integer    shipUpgradeId ;

    @Column(name="quantity")
    private Integer    quantity ;

    //--- LINKS ( RELATIONSHIPS )
    @ManyToOne
    @JoinColumn(name="ship_id", referencedColumnName="ship_id", insertable=false, updatable=false)
    private CrewShips  crewships ; 

    @ManyToOne
    @JoinColumn(name="ship_upgrade_id", referencedColumnName="ship_upgrade_id", insertable=false, updatable=false)
    private ShipUpgrades shipupgrades ; 

    /**
     * Constructor
     */
    public CrewShipUpgrades() {
		super();
    }
    
    public void setCrewShipUpgradeId( int crewShipUpgradeId ) {
        this.crewShipUpgradeId = crewShipUpgradeId ;
    }
    public int getCrewShipUpgradeId() {
        return this.crewShipUpgradeId;
    }

    public void setShipId( Integer shipId ) {
        this.shipId = shipId ;
    }
    public Integer getShipId() {
        return this.shipId;
    }

    public void setShipUpgradeId( Integer shipUpgradeId ) {
        this.shipUpgradeId = shipUpgradeId ;
    }
    public Integer getShipUpgradeId() {
        return this.shipUpgradeId;
    }

    public void setQuantity( Integer quantity ) {
        this.quantity = quantity ;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public CrewShips getCrewships() {
        return this.crewships;
    } 

    public ShipUpgrades getShipupgrades() {
        return this.shipupgrades;
    } 

	@Override
	public String toString() { 
		String separator = "|";
		StringBuilder sb = new StringBuilder();
		sb.append("CrewShipUpgrades[");
		sb.append("crewShipUpgradeId=").append(crewShipUpgradeId);
		sb.append(separator).append("shipId=").append(shipId);
		sb.append(separator).append("shipUpgradeId=").append(shipUpgradeId);
		sb.append(separator).append("quantity=").append(quantity);
		sb.append("]");
		return sb.toString();
	}

}
