package com.eg0n.startools.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2024-12-18T19:37:30.413+0100")
@StaticMetamodel(Character.class)
public class Character_ {
	public static volatile SingularAttribute<Character, Integer> characterId;
	public static volatile SingularAttribute<Character, Integer> armor;
	public static volatile SingularAttribute<Character, Integer> backgroundId;
	public static volatile SingularAttribute<Character, Integer> crewId;
	public static volatile SingularAttribute<Character, Integer> currentHealth;
	public static volatile SingularAttribute<Character, Integer> fight;
	public static volatile SingularAttribute<Character, Integer> health;
	public static volatile SingularAttribute<Character, Integer> level;
	public static volatile SingularAttribute<Character, Integer> move;
	public static volatile SingularAttribute<Character, String> name;
	public static volatile SingularAttribute<Character, Integer> roleId;
	public static volatile SingularAttribute<Character, Integer> shoot;
	public static volatile SingularAttribute<Character, Integer> will;
	public static volatile SingularAttribute<Character, Background> background;
	public static volatile SingularAttribute<Character, CharacterRole> characterRole;
	public static volatile SingularAttribute<Character, Crew> crew;
}
