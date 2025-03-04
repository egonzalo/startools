/*
 * Created on 2025-01-20 ( 17:03:22 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.eg0n.startools.telosys.persistence.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "SoldierClasses"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="soldier_classes", schema="stargrave" )
public class SoldierClasses implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="soldier_class_id", nullable=false)
    private int        soldierClassId ;

    //--- OTHER DATA FIELDS 
    @Column(name="name", nullable=false, length=50)
    private String     name ;

    @Column(name="description", length=2147483647)
    private String     description ;

    //--- LINKS ( RELATIONSHIPS )
    @OneToMany(mappedBy="soldierclasses")
    private List<SoldierTypes> soldiertypesList ; 

    /**
     * Constructor
     */
    public SoldierClasses() {
		super();
    }
    
    public void setSoldierClassId( int soldierClassId ) {
        this.soldierClassId = soldierClassId ;
    }
    public int getSoldierClassId() {
        return this.soldierClassId;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setDescription( String description ) {
        this.description = description ;
    }
    public String getDescription() {
        return this.description;
    }

    public List<SoldierTypes> getSoldiertypesList() {
        return this.soldiertypesList;
    } 

	@Override
	public String toString() { 
		String separator = "|";
		StringBuilder sb = new StringBuilder();
		sb.append("SoldierClasses[");
		sb.append("soldierClassId=").append(soldierClassId);
		sb.append(separator).append("name=").append(name);
		sb.append(separator).append("description=").append(description);
		sb.append("]");
		return sb.toString();
	}

}
