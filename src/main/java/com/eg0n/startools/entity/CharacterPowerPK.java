package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the "character_powers" database table.
 * 
 */
@Embeddable
public class CharacterPowerPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"character_id\"", insertable=false, updatable=false)
	private int characterId;

	@Column(name="\"power_id\"", insertable=false, updatable=false)
	private int powerId;

	public CharacterPowerPK() {
	}
	public int getCharacterId() {
		return this.characterId;
	}
	public void setCharacterId(int characterId) {
		this.characterId = characterId;
	}
	public int getPowerId() {
		return this.powerId;
	}
	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CharacterPowerPK)) {
			return false;
		}
		CharacterPowerPK castOther = (CharacterPowerPK)other;
		return 
			(this.characterId == castOther.characterId)
			&& (this.powerId == castOther.powerId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.characterId;
		hash = hash * prime + this.powerId;
		
		return hash;
	}
}