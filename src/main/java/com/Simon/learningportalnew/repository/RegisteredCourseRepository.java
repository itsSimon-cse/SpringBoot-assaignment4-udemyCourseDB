package com.Simon.learningportalnew.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Simon.learningportalnew.entity.RegisteredCourseEntity;

@Repository
public interface RegisteredCourseRepository extends JpaRepository<RegisteredCourseEntity, Long> {
	@Query(value = "SELECT rc FROM registered_courses rc WHERE rc.user.userId = :userId", nativeQuery = true)
	List<RegisteredCourseEntity> findByUserId(Long userId);
}
