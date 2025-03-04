/*
 * Created on 2025-01-20 ( 17:03:22 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.eg0n.startools.telosys.persistence.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.eg0n.startools.telosys.persistence.entities.CharacterRoles;

/**
 * Spring Data JPA repository for entity "CharacterRoles" <br> 
 * 
 * This repository extends PagingAndSortingRepository interface <br>
 * so it provides by default all the basic CRUD operations : <br>
 *   findById, findAll, save, delete, etc <br> 
 * with pagination and sorting : <br>
 *   findAll(Pageable), findAll(Sort)<br>
 * 
 * This repository can be extended by adding specific "finders" methods<br>
 * To do so, see the "predicates conventions" for "derived query methods" in Spring Data documentation
 * 
 * @author Telosys
 *
 */
public interface CharacterRolesRepository extends PagingAndSortingRepository<CharacterRoles, Integer> {

	// Insert specific finders here 

	//List<CharacterRoles> findByXxx(String xxx);

	//List<CharacterRoles> findByXxxStartingWith(String xxx);

	//List<CharacterRoles> findByXxxContaining(String xxx);

	//List<CharacterRoles> findByYyy(BigDecimal yyy);

	//List<CharacterRoles> findByXxxContainingAndYyy(String xxx, BigDecimal yyy);
}
