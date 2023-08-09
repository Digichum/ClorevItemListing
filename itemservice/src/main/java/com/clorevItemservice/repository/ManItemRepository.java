package com.clorevItemservice.repository;

import com.clorevItemservice.entities.Man;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManItemRepository extends JpaRepository<Man,Integer> {
}
