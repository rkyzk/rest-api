package com.restapi.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.api.entity.UserEntity;

@Repository
public interface UserMapper extends JpaRepository<UserEntity, Long> {
	/** get user by username */
	Optional<UserEntity> findByUsername(String username);	
}
