package com.eg0n.startools.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2024-12-18T19:37:30.415+0100")
@StaticMetamodel(CharacterPower.class)
public class CharacterPower_ {
	public static volatile SingularAttribute<CharacterPower, CharacterPowerPK> id;
	public static volatile SingularAttribute<CharacterPower, Integer> activationNumber;
	public static volatile SingularAttribute<CharacterPower, Character> character;
	public static volatile SingularAttribute<CharacterPower, Power> power;
}
