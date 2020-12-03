package com.crystaldata.dslearn.repositories;

import com.crystaldata.dslearn.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}
