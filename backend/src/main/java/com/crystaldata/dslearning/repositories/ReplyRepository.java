package com.crystaldata.dslearning.repositories;

import com.crystaldata.dslearning.entities.Offer;
import com.crystaldata.dslearning.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
