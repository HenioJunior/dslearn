package com.crystaldata.dslearning.repositories;

import com.crystaldata.dslearning.entities.Topic;
import com.crystaldata.dslearning.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
