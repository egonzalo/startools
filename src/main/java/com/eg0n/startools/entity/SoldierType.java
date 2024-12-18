package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "soldier_types" database table.
 * 
 */
@Entity
@Table(name="\"soldier_types\"")
@NamedQuery(name="SoldierType.findAll", query="SELECT s FROM SoldierType s")
public class SoldierType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"soldier_type_id\"")
	private int soldierTypeId;

	@Column(name="\"armor\"")
	private int armor;

	@Column(name="\"class_id\"")
	private int classId;

	@Column(name="\"cost\"")
	private int cost;

	@Column(name="\"fight\"")
	private int fight;

	@Column(name="\"health\"")
	private int health;

	@Column(name="\"move\"")
	private int move;

	@Column(name="\"name\"")
	private String name;

	@Column(name="\"notes\"")
	private String notes;

	@Column(name="\"shoot\"")
	private int shoot;

	@Column(name="\"will\"")
	private int will;

	//bi-directional many-to-one association to SoldierClass
	@ManyToOne
	@JoinColumns({
		})
	private SoldierClass soldierClass;

	//bi-directional many-to-one association to Soldier
	@OneToMany(mappedBy="soldierType")
	private List<Soldier> soldiers;

	public SoldierType() {
	}

	public int getSoldierTypeId() {
		return this.soldierTypeId;
	}

	public void setSoldierTypeId(int soldierTypeId) {
		this.soldierTypeId = soldierTypeId;
	}

	public int getArmor() {
		return this.armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getClassId() {
		return this.classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getCost() {
		return this.cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getFight() {
		return this.fight;
	}

	public void setFight(int fight) {
		this.fight = fight;
	}

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMove() {
		return this.move;
	}

	public void setMove(int move) {
		this.move = move;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getShoot() {
		return this.shoot;
	}

	public void setShoot(int shoot) {
		this.shoot = shoot;
	}

	public int getWill() {
		return this.will;
	}

	public void setWill(int will) {
		this.will = will;
	}

	public SoldierClass getSoldierClass() {
		return this.soldierClass;
	}

	public void setSoldierClass(SoldierClass soldierClass) {
		this.soldierClass = soldierClass;
	}

	public List<Soldier> getSoldiers() {
		return this.soldiers;
	}

	public void setSoldiers(List<Soldier> soldiers) {
		this.soldiers = soldiers;
	}

	public Soldier addSoldier(Soldier soldier) {
		getSoldiers().add(soldier);
		soldier.setSoldierType(this);

		return soldier;
	}

	public Soldier removeSoldier(Soldier soldier) {
		getSoldiers().remove(soldier);
		soldier.setSoldierType(null);

		return soldier;
	}

}