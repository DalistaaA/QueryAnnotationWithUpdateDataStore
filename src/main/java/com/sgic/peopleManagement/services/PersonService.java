package com.sgic.peopleManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.peopleManagement.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	public void updatePersonById(int id, String newEmail) {
		personRepository.updatePersonById(id,newEmail);
	}
		
}
