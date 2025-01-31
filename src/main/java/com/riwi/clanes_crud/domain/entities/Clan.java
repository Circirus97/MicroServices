package com.riwi.clanes_crud.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "clan")
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Clan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @Builder.Default // Para que no tome los valores que ya estan llenas
    private LocalDateTime createdAt = LocalDateTime.now();

    @Builder.Default
    private LocalDateTime updatedAt = LocalDateTime.now();

    @Builder.Default
    private Boolean isActive = true;

    @ManyToOne()
    @JoinColumn(name = "cohort_id",referencedColumnName = "id")
    private Cohort cohort;
}
