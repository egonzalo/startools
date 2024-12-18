package com.eg0n.startools.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2024-12-18T19:37:30.433+0100")
@StaticMetamodel(EncounterEntry.class)
public class EncounterEntry_ {
	public static volatile SingularAttribute<EncounterEntry, Integer> encounterEntryId;
	public static volatile SingularAttribute<EncounterEntry, Integer> creatureId;
	public static volatile SingularAttribute<EncounterEntry, Integer> encounterTableId;
	public static volatile SingularAttribute<EncounterEntry, Integer> maxRoll;
	public static volatile SingularAttribute<EncounterEntry, Integer> minRoll;
	public static volatile SingularAttribute<EncounterEntry, Integer> quantity;
	public static volatile SingularAttribute<EncounterEntry, Creature> creature;
	public static volatile SingularAttribute<EncounterEntry, EncounterTable> encounterTable;
}
