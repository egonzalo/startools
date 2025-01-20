/*
 * Created on 2025-01-20 ( 17:03:22 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.eg0n.startools.telosys.persistence.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Soldiers"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="soldiers", schema="stargrave" )
public class Soldiers implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="soldier_id", nullable=false)
    private int        soldierId ;

    //--- OTHER DATA FIELDS 
    @Column(name="crew_id")
    private Integer    crewId ;

    @Column(name="soldier_type_id")
    private Integer    soldierTypeId ;

    @Column(name="name", length=100)
    private String     name ;

    @Column(name="current_health")
    private Integer    currentHealth ;

    //--- LINKS ( RELATIONSHIPS )
    @ManyToMany
    @JoinTable( name="soldier_equipment", 
      joinColumns = @JoinColumn( name="soldier_id", referencedColumnName="soldier_id"),
      inverseJoinColumns = @JoinColumn( name="equipment_type_id", referencedColumnName="equipment_type_id") )
    private List<EquipmentTypes> equipmenttypesList ; 

    @ManyToOne
    @JoinColumn(name="crew_id", referencedColumnName="crew_id", insertable=false, updatable=false)
    private Crews      crews ; 

    @ManyToOne
    @JoinColumn(name="soldier_type_id", referencedColumnName="soldier_type_id", insertable=false, updatable=false)
    private SoldierTypes soldiertypes ; 

    /**
     * Constructor
     */
    public Soldiers() {
		super();
    }
    
    public void setSoldierId( int soldierId ) {
        this.soldierId = soldierId ;
    }
    public int getSoldierId() {
        return this.soldierId;
    }

    public void setCrewId( Integer crewId ) {
        this.crewId = crewId ;
    }
    public Integer getCrewId() {
        return this.crewId;
    }

    public void setSoldierTypeId( Integer soldierTypeId ) {
        this.soldierTypeId = soldierTypeId ;
    }
    public Integer getSoldierTypeId() {
        return this.soldierTypeId;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setCurrentHealth( Integer currentHealth ) {
        this.currentHealth = currentHealth ;
    }
    public Integer getCurrentHealth() {
        return this.currentHealth;
    }

    public List<EquipmentTypes> getEquipmenttypesList() {
        return this.equipmenttypesList;
    } 

    public Crews getCrews() {
        return this.crews;
    } 

    public SoldierTypes getSoldiertypes() {
        return this.soldiertypes;
    } 

	@Override
	public String toString() { 
		String separator = "|";
		StringBuilder sb = new StringBuilder();
		sb.append("Soldiers[");
		sb.append("soldierId=").append(soldierId);
		sb.append(separator).append("crewId=").append(crewId);
		sb.append(separator).append("soldierTypeId=").append(soldierTypeId);
		sb.append(separator).append("name=").append(name);
		sb.append(separator).append("currentHealth=").append(currentHealth);
		sb.append("]");
		return sb.toString();
	}

}
