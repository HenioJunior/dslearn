package com.crystaldata.dslearn.repositories;

import com.crystaldata.dslearn.entities.Notification;
import com.crystaldata.dslearn.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface NotificationRepository extends JpaRepository<Notification, Long> {

    @Query("SELECT obj FROM Notification obj WHERE "
    + "(obj.user = :user) AND "
    + "(obj.read = :read) "
    + "ORDER BY obj.moment DESC")
    Page<Notification> find(User user, boolean read, Pageable pageable);
}
