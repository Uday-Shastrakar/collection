package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.User;
@Repository
public interface Employerepo extends CrudRepository <User, Long> {
	
}
