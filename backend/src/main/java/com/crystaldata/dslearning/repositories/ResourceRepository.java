package com.crystaldata.dslearning.repositories;

import com.crystaldata.dslearning.entities.Reply;
import com.crystaldata.dslearning.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
