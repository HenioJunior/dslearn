package com.crystaldata.dslearning.repositories;

import com.crystaldata.dslearning.entities.Deliver;
import com.crystaldata.dslearning.entities.Enrollment;
import com.crystaldata.dslearning.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
