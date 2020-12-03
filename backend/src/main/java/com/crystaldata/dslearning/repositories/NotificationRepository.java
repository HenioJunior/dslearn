package com.crystaldata.dslearning.repositories;

import com.crystaldata.dslearning.entities.Lesson;
import com.crystaldata.dslearning.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
