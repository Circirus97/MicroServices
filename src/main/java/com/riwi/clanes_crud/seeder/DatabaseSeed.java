package com.riwi.clanes_crud.seeder;

import com.riwi.clanes_crud.domain.entities.Cohort;
import com.riwi.clanes_crud.domain.repositories.CohortRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class DatabaseSeed implements CommandLineRunner {

    private final CohortRepository cohortRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("Seeding database Cohort Executed");

        if (this.cohortRepository.count() > 0) return;

        Cohort cohort1 = Cohort.builder().name("Cohort 1").build();
        Cohort cohort2 = Cohort.builder().name("Cohort 2").build();
        Cohort cohort3 = Cohort.builder().name("Cohort 3").build();

        cohortRepository.save(cohort1);
        cohortRepository.save(cohort2);
        cohortRepository.save(cohort3);
    }
}
