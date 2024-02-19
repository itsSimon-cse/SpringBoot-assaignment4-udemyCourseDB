package com.Simon.learningportalnew.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Simon.learningportalnew.entity.FavouriteCourseEntity;

@Repository
public interface FavouriteCourseRepository extends JpaRepository<FavouriteCourseEntity, Long> {
	@Query("SELECT f FROM FavouriteCourseEntity f WHERE f.registeredCourse.registrationId = :registrationId")
	List<FavouriteCourseEntity> findByRegistrationId(Long registrationId);
}
