/*
 * Created on 2025-01-20 ( 17:03:22 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.eg0n.startools.telosys.persistence.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.eg0n.startools.telosys.persistence.entities.SoldierTypes;

/**
 * Spring Data JPA repository for entity "SoldierTypes" <br> 
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
public interface SoldierTypesRepository extends PagingAndSortingRepository<SoldierTypes, Integer> {

	// Insert specific finders here 

	//List<SoldierTypes> findByXxx(String xxx);

	//List<SoldierTypes> findByXxxStartingWith(String xxx);

	//List<SoldierTypes> findByXxxContaining(String xxx);

	//List<SoldierTypes> findByYyy(BigDecimal yyy);

	//List<SoldierTypes> findByXxxContainingAndYyy(String xxx, BigDecimal yyy);
}
