package com.eg0n.startools.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2024-12-18T19:37:30.438+0100")
@StaticMetamodel(EquipmentType.class)
public class EquipmentType_ {
	public static volatile SingularAttribute<EquipmentType, Integer> equipmentTypeId;
	public static volatile SingularAttribute<EquipmentType, String> description;
	public static volatile SingularAttribute<EquipmentType, String> name;
	public static volatile SingularAttribute<EquipmentType, Integer> slotTypeId;
	public static volatile SingularAttribute<EquipmentType, EquipmentSlot> equipmentSlot;
}
