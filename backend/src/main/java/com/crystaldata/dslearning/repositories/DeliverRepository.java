package com.crystaldata.dslearning.repositories;

import com.crystaldata.dslearning.entities.Course;
import com.crystaldata.dslearning.entities.Deliver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliverRepository extends JpaRepository<Deliver, Long> {
}
