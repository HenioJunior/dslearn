package com.crystaldata.dslearning.repositories;

import com.crystaldata.dslearning.entities.Enrollment;
import com.crystaldata.dslearning.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
