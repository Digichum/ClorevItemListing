package com.clorevItemservice.repository;

import com.clorevItemservice.entities.Household;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseholdItemRepository extends JpaRepository<Household, Integer> {
}
