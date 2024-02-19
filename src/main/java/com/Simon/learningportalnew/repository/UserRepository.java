package com.Simon.learningportalnew.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Simon.learningportalnew.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
