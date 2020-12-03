package com.crystaldata.dslearning.repositories;

import com.crystaldata.dslearning.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
