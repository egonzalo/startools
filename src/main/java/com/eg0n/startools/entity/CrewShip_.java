package com.eg0n.startools.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2024-12-18T19:37:30.428+0100")
@StaticMetamodel(CrewShip.class)
public class CrewShip_ {
	public static volatile SingularAttribute<CrewShip, Integer> shipId;
	public static volatile SingularAttribute<CrewShip, Integer> crewId;
	public static volatile SingularAttribute<CrewShip, String> name;
	public static volatile SingularAttribute<CrewShip, Crew> crew;
}
