package com.riwi.clanes_crud.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ClanGetReq {

    private Integer page;

    private Integer size;

    private String name;

    private String description;

    private Boolean isActive;

    private Long cohortId;
}

