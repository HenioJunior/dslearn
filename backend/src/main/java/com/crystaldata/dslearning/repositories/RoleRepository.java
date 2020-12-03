package com.crystaldata.dslearning.repositories;

import com.crystaldata.dslearning.entities.Resource;
import com.crystaldata.dslearning.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
