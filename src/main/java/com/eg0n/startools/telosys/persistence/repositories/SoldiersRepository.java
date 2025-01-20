/*
 * Created on 2025-01-20 ( 17:03:22 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.eg0n.startools.telosys.persistence.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.eg0n.startools.telosys.persistence.entities.Soldiers;

/**
 * Spring Data JPA repository for entity "Soldiers" <br> 
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
public interface SoldiersRepository extends PagingAndSortingRepository<Soldiers, Integer> {

	// Insert specific finders here 

	//List<Soldiers> findByXxx(String xxx);

	//List<Soldiers> findByXxxStartingWith(String xxx);

	//List<Soldiers> findByXxxContaining(String xxx);

	//List<Soldiers> findByYyy(BigDecimal yyy);

	//List<Soldiers> findByXxxContainingAndYyy(String xxx, BigDecimal yyy);
}
