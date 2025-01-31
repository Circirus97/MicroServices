package com.riwi.clanes_crud.domain.repositories;

import com.riwi.clanes_crud.domain.entities.Clan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClanRepository extends JpaRepository<Clan, Long> {
    @Query("SELECT c FROM clan c WHERE" +
            "(:name IS NULL OR c.name LIKE %:name%) AND" +
            "(:description IS NULL OR c.description LIKE %:description%) AND" +
            "(:isActive IS NULL OR c.isActive = :isActive) AND" +
            "(:cohortId IS NULL OR c.cohort.id = :cohortId)")
    public Page<Clan> getAll(
            @Param("name") String name,
            @Param("description") String description,
            @Param("isActive") Boolean isActive,
            @Param("cohortId") Long cohortId,
            Pageable pagination);
}
