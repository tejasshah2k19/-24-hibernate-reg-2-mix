package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.UserEntity;

//dao -> 
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	
	//insert
	//update 
	//delete 
	//select 
	//sort 
	//
}
