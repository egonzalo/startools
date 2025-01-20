/*
 * Created on 2025-01-20 ( 17:03:22 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.eg0n.startools.telosys.persistence.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * JPA entity class for "EncounterEntries"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="encounter_entries", schema="stargrave" )
public class EncounterEntries implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="encounter_entry_id", nullable=false)
    private int        encounterEntryId ;

    //--- OTHER DATA FIELDS 
    @Column(name="encounter_table_id")
    private Integer    encounterTableId ;

    @Column(name="creature_id")
    private Integer    creatureId ;

    @Column(name="min_roll", nullable=false)
    private int        minRoll ;

    @Column(name="max_roll", nullable=false)
    private int        maxRoll ;

    @Column(name="quantity")
    private Integer    quantity ;

    //--- LINKS ( RELATIONSHIPS )
    @ManyToOne
    @JoinColumn(name="creature_id", referencedColumnName="creature_id", insertable=false, updatable=false)
    private Creatures  creatures ; 

    @ManyToOne
    @JoinColumn(name="encounter_table_id", referencedColumnName="encounter_table_id", insertable=false, updatable=false)
    private EncounterTables encountertables ; 

    /**
     * Constructor
     */
    public EncounterEntries() {
		super();
    }
    
    public void setEncounterEntryId( int encounterEntryId ) {
        this.encounterEntryId = encounterEntryId ;
    }
    public int getEncounterEntryId() {
        return this.encounterEntryId;
    }

    public void setEncounterTableId( Integer encounterTableId ) {
        this.encounterTableId = encounterTableId ;
    }
    public Integer getEncounterTableId() {
        return this.encounterTableId;
    }

    public void setCreatureId( Integer creatureId ) {
        this.creatureId = creatureId ;
    }
    public Integer getCreatureId() {
        return this.creatureId;
    }

    public void setMinRoll( int minRoll ) {
        this.minRoll = minRoll ;
    }
    public int getMinRoll() {
        return this.minRoll;
    }

    public void setMaxRoll( int maxRoll ) {
        this.maxRoll = maxRoll ;
    }
    public int getMaxRoll() {
        return this.maxRoll;
    }

    public void setQuantity( Integer quantity ) {
        this.quantity = quantity ;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public Creatures getCreatures() {
        return this.creatures;
    } 

    public EncounterTables getEncountertables() {
        return this.encountertables;
    } 

	@Override
	public String toString() { 
		String separator = "|";
		StringBuilder sb = new StringBuilder();
		sb.append("EncounterEntries[");
		sb.append("encounterEntryId=").append(encounterEntryId);
		sb.append(separator).append("encounterTableId=").append(encounterTableId);
		sb.append(separator).append("creatureId=").append(creatureId);
		sb.append(separator).append("minRoll=").append(minRoll);
		sb.append(separator).append("maxRoll=").append(maxRoll);
		sb.append(separator).append("quantity=").append(quantity);
		sb.append("]");
		return sb.toString();
	}

}
