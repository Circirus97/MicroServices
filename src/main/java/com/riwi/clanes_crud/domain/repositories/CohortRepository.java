package com.riwi.clanes_crud.domain.repositories;

import com.riwi.clanes_crud.domain.entities.Cohort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CohortRepository extends JpaRepository<Cohort, Long> {
}
