package com.eg0n.startools.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2024-12-18T19:37:30.440+0100")
@StaticMetamodel(Power.class)
public class Power_ {
	public static volatile SingularAttribute<Power, Integer> powerId;
	public static volatile SingularAttribute<Power, Integer> activationNumber;
	public static volatile SingularAttribute<Power, Integer> categoryId;
	public static volatile SingularAttribute<Power, String> description;
	public static volatile SingularAttribute<Power, String> name;
	public static volatile SingularAttribute<Power, Integer> strain;
	public static volatile SingularAttribute<Power, PowerCategory> powerCategory;
}
