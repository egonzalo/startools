package com.eg0n.startools.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the "character_roles" database table.
 * 
 */
@Entity
@Table(name="\"character_roles\"")
@NamedQuery(name="CharacterRole.findAll", query="SELECT c FROM CharacterRole c")
public class CharacterRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="\"character_role_id\"")
	private int characterRoleId;

	@Column(name="\"description\"")
	private String description;

	@Column(name="\"name\"")
	private String name;

	//bi-directional many-to-one association to Character
	@OneToMany(mappedBy="characterRole")
	private List<Character> characters;

	public CharacterRole() {
	}

	public int getCharacterRoleId() {
		return this.characterRoleId;
	}

	public void setCharacterRoleId(int characterRoleId) {
		this.characterRoleId = characterRoleId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Character> getCharacters() {
		return this.characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}

	public Character addCharacter(Character character) {
		getCharacters().add(character);
		character.setCharacterRole(this);

		return character;
	}

	public Character removeCharacter(Character character) {
		getCharacters().remove(character);
		character.setCharacterRole(null);

		return character;
	}

}