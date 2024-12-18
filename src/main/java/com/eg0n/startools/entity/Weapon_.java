package com.eg0n.startools.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2024-12-18T19:37:30.453+0100")
@StaticMetamodel(Weapon.class)
public class Weapon_ {
	public static volatile SingularAttribute<Weapon, Integer> weaponId;
	public static volatile SingularAttribute<Weapon, Integer> damageModifier;
	public static volatile SingularAttribute<Weapon, Integer> equipmentTypeId;
	public static volatile SingularAttribute<Weapon, Integer> gearSlots;
	public static volatile SingularAttribute<Weapon, Integer> maxRange;
	public static volatile SingularAttribute<Weapon, String> name;
	public static volatile SingularAttribute<Weapon, String> notes;
	public static volatile SingularAttribute<Weapon, EquipmentType> equipmentType;
}
