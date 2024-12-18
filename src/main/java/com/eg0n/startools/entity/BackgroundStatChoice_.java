package com.eg0n.startools.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2024-12-18T19:37:30.410+0100")
@StaticMetamodel(BackgroundStatChoice.class)
public class BackgroundStatChoice_ {
	public static volatile SingularAttribute<BackgroundStatChoice, Integer> backgroundId;
	public static volatile SingularAttribute<BackgroundStatChoice, Boolean> canChooseFight;
	public static volatile SingularAttribute<BackgroundStatChoice, Boolean> canChooseHealth;
	public static volatile SingularAttribute<BackgroundStatChoice, Boolean> canChooseMove;
	public static volatile SingularAttribute<BackgroundStatChoice, Boolean> canChooseShoot;
	public static volatile SingularAttribute<BackgroundStatChoice, Integer> choicesAllowed;
	public static volatile SingularAttribute<BackgroundStatChoice, Background> background;
}
