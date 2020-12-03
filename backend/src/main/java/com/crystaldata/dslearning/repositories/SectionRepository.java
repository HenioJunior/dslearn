package com.crystaldata.dslearning.repositories;

import com.crystaldata.dslearning.entities.Resource;
import com.crystaldata.dslearning.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}
