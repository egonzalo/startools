package com.eg0n.startools.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2024-12-18T19:37:30.403+0100")
@StaticMetamodel(Armor.class)
public class Armor_ {
	public static volatile SingularAttribute<Armor, Integer> armorId;
	public static volatile SingularAttribute<Armor, Integer> armorModifier;
	public static volatile SingularAttribute<Armor, Integer> equipmentTypeId;
	public static volatile SingularAttribute<Armor, Integer> gearSlots;
	public static volatile SingularAttribute<Armor, Integer> movementPenalty;
	public static volatile SingularAttribute<Armor, String> name;
	public static volatile SingularAttribute<Armor, String> notes;
	public static volatile SingularAttribute<Armor, EquipmentType> equipmentType;
}
