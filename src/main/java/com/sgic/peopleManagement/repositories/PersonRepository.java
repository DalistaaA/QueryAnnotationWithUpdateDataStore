package com.sgic.peopleManagement.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.sgic.peopleManagement.entities.Person;

public interface PersonRepository extends Repository<Person, Integer>{

	@Transactional
	@Modifying(clearAutomatically=true)
	@Query(value="UPDATE Person set email	=:newEmail WHERE id=:personId")
	void updatePersonById(@Param("personId")int id, @Param("newEmail")String newEmail);

	
}
