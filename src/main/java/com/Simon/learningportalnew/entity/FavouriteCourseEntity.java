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
@Table(name = "favourite_Course")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FavouriteCourseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "favourite_Id")
	private Long favouriteId;

	//mapping many to one
	@ManyToOne
	@JoinColumn(name = "registration_Id") //foreign key
	private RegisteredCourseEntity registeredCourse;

}
