package com.crystaldata.dslearning.repositories;

import com.crystaldata.dslearning.entities.Task;
import com.crystaldata.dslearning.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
