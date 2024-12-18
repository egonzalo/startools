package com.eg0n.startools.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2024-12-18T19:37:30.430+0100")
@StaticMetamodel(CrewShipUpgrade.class)
public class CrewShipUpgrade_ {
	public static volatile SingularAttribute<CrewShipUpgrade, Integer> crewShipUpgradeId;
	public static volatile SingularAttribute<CrewShipUpgrade, Integer> quantity;
	public static volatile SingularAttribute<CrewShipUpgrade, Integer> shipId;
	public static volatile SingularAttribute<CrewShipUpgrade, Integer> shipUpgradeId;
	public static volatile SingularAttribute<CrewShipUpgrade, CrewShip> crewShip;
	public static volatile SingularAttribute<CrewShipUpgrade, ShipUpgrade> shipUpgrade;
}
