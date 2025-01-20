/*
 * Created on 2025-01-20 ( 17:03:22 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.eg0n.startools.telosys.persistence.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "EquipmentSlots"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="equipment_slots", schema="stargrave" )
public class EquipmentSlots implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="equipment_slot_id", nullable=false)
    private int        equipmentSlotId ;

    //--- OTHER DATA FIELDS 
    @Column(name="name", nullable=false, length=50)
    private String     name ;

    @Column(name="description", length=2147483647)
    private String     description ;

    //--- LINKS ( RELATIONSHIPS )
    @OneToMany(mappedBy="equipmentslots")
    private List<EquipmentTypes> equipmenttypesList ; 

    /**
     * Constructor
     */
    public EquipmentSlots() {
		super();
    }
    
    public void setEquipmentSlotId( int equipmentSlotId ) {
        this.equipmentSlotId = equipmentSlotId ;
    }
    public int getEquipmentSlotId() {
        return this.equipmentSlotId;
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

    public List<EquipmentTypes> getEquipmenttypesList() {
        return this.equipmenttypesList;
    } 

	@Override
	public String toString() { 
		String separator = "|";
		StringBuilder sb = new StringBuilder();
		sb.append("EquipmentSlots[");
		sb.append("equipmentSlotId=").append(equipmentSlotId);
		sb.append(separator).append("name=").append(name);
		sb.append(separator).append("description=").append(description);
		sb.append("]");
		return sb.toString();
	}

}
