package com.eg0n.startools.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2024-12-18T19:37:30.451+0100")
@StaticMetamodel(SoldierType.class)
public class SoldierType_ {
	public static volatile SingularAttribute<SoldierType, Integer> soldierTypeId;
	public static volatile SingularAttribute<SoldierType, Integer> armor;
	public static volatile SingularAttribute<SoldierType, Integer> classId;
	public static volatile SingularAttribute<SoldierType, Integer> cost;
	public static volatile SingularAttribute<SoldierType, Integer> fight;
	public static volatile SingularAttribute<SoldierType, Integer> health;
	public static volatile SingularAttribute<SoldierType, Integer> move;
	public static volatile SingularAttribute<SoldierType, String> name;
	public static volatile SingularAttribute<SoldierType, String> notes;
	public static volatile SingularAttribute<SoldierType, Integer> shoot;
	public static volatile SingularAttribute<SoldierType, Integer> will;
	public static volatile SingularAttribute<SoldierType, SoldierClass> soldierClass;
}
