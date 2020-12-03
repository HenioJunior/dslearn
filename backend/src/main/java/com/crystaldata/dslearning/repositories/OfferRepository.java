package com.crystaldata.dslearning.repositories;

import com.crystaldata.dslearning.entities.Notification;
import com.crystaldata.dslearning.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
