package com.crystaldata.dslearn.repositories;

import com.crystaldata.dslearn.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
