package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the "background_stat_choices" database table.
 * 
 */
@Entity
@Table(name="\"background_stat_choices\"")
@NamedQuery(name="BackgroundStatChoice.findAll", query="SELECT b FROM BackgroundStatChoice b")
public class BackgroundStatChoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"background_id\"")
	private int backgroundId;

	@Column(name="\"can_choose_fight\"")
	private boolean canChooseFight;

	@Column(name="\"can_choose_health\"")
	private boolean canChooseHealth;

	@Column(name="\"can_choose_move\"")
	private boolean canChooseMove;

	@Column(name="\"can_choose_shoot\"")
	private boolean canChooseShoot;

	@Column(name="\"choices_allowed\"")
	private int choicesAllowed;

	//bi-directional many-to-one association to Background
	@ManyToOne
	@JoinColumns({
		})
	private Background background;

	public BackgroundStatChoice() {
	}

	public int getBackgroundId() {
		return this.backgroundId;
	}

	public void setBackgroundId(int backgroundId) {
		this.backgroundId = backgroundId;
	}

	public boolean getCanChooseFight() {
		return this.canChooseFight;
	}

	public void setCanChooseFight(boolean canChooseFight) {
		this.canChooseFight = canChooseFight;
	}

	public boolean getCanChooseHealth() {
		return this.canChooseHealth;
	}

	public void setCanChooseHealth(boolean canChooseHealth) {
		this.canChooseHealth = canChooseHealth;
	}

	public boolean getCanChooseMove() {
		return this.canChooseMove;
	}

	public void setCanChooseMove(boolean canChooseMove) {
		this.canChooseMove = canChooseMove;
	}

	public boolean getCanChooseShoot() {
		return this.canChooseShoot;
	}

	public void setCanChooseShoot(boolean canChooseShoot) {
		this.canChooseShoot = canChooseShoot;
	}

	public int getChoicesAllowed() {
		return this.choicesAllowed;
	}

	public void setChoicesAllowed(int choicesAllowed) {
		this.choicesAllowed = choicesAllowed;
	}

	public Background getBackground() {
		return this.background;
	}

	public void setBackground(Background background) {
		this.background = background;
	}

}