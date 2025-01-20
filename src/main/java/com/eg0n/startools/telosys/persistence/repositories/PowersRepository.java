/*
 * Created on 2025-01-20 ( 17:03:22 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.eg0n.startools.telosys.persistence.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.eg0n.startools.telosys.persistence.entities.Powers;

/**
 * Spring Data JPA repository for entity "Powers" <br> 
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
public interface PowersRepository extends PagingAndSortingRepository<Powers, Integer> {

	// Insert specific finders here 

	//List<Powers> findByXxx(String xxx);

	//List<Powers> findByXxxStartingWith(String xxx);

	//List<Powers> findByXxxContaining(String xxx);

	//List<Powers> findByYyy(BigDecimal yyy);

	//List<Powers> findByXxxContainingAndYyy(String xxx, BigDecimal yyy);
}
