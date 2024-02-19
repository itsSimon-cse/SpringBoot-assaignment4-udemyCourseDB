package com.Simon.learningportalnew.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "registered_courses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisteredCourseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "registration_Id")
	private Long registrationId;

	//mapping many to one
	@ManyToOne
	@JoinColumn(name = "userId") //foreign key
	private UserEntity user;

	//mapping with courses
	@ManyToOne
	@JoinColumn(name = "courseId") //foreign key
	private CourseEntity course;
}
