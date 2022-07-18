package com.crudop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudop.Entity.Books;

@Repository
public interface BookReposiroty extends CrudRepository<Books, Integer> {

	
	
}
