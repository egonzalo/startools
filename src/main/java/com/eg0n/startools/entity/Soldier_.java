package com.eg0n.startools.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2024-12-18T19:37:30.447+0100")
@StaticMetamodel(Soldier.class)
public class Soldier_ {
	public static volatile SingularAttribute<Soldier, Integer> soldierId;
	public static volatile SingularAttribute<Soldier, Integer> crewId;
	public static volatile SingularAttribute<Soldier, Integer> currentHealth;
	public static volatile SingularAttribute<Soldier, String> name;
	public static volatile SingularAttribute<Soldier, Integer> soldierTypeId;
	public static volatile SingularAttribute<Soldier, Crew> crew;
	public static volatile SingularAttribute<Soldier, SoldierType> soldierType;
}
