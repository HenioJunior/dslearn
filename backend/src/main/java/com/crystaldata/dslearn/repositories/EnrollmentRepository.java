package com.crystaldata.dslearn.repositories;

import com.crystaldata.dslearn.entities.Enrollment;
import com.crystaldata.dslearn.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
