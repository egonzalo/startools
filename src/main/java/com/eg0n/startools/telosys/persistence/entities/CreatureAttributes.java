/*
 * Created on 2025-01-20 ( 17:03:22 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.eg0n.startools.telosys.persistence.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "CreatureAttributes"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="creature_attributes", schema="stargrave" )
public class CreatureAttributes implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="attribute_id", nullable=false)
    private int        attributeId ;

    //--- OTHER DATA FIELDS 
    @Column(name="name", nullable=false, length=50)
    private String     name ;

    @Column(name="description", length=2147483647)
    private String     description ;

    //--- LINKS ( RELATIONSHIPS )
    @ManyToMany
    @JoinTable( name="creature_attributes_link", 
      joinColumns = @JoinColumn( name="attribute_id", referencedColumnName="attribute_id"),
      inverseJoinColumns = @JoinColumn( name="creature_id", referencedColumnName="creature_id") )
    private List<Creatures> creaturesList ; 

    /**
     * Constructor
     */
    public CreatureAttributes() {
		super();
    }
    
    public void setAttributeId( int attributeId ) {
        this.attributeId = attributeId ;
    }
    public int getAttributeId() {
        return this.attributeId;
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

    public List<Creatures> getCreaturesList() {
        return this.creaturesList;
    } 

	@Override
	public String toString() { 
		String separator = "|";
		StringBuilder sb = new StringBuilder();
		sb.append("CreatureAttributes[");
		sb.append("attributeId=").append(attributeId);
		sb.append(separator).append("name=").append(name);
		sb.append(separator).append("description=").append(description);
		sb.append("]");
		return sb.toString();
	}

}
