package com.riwi.clanes_crud.api.controller;

import com.riwi.clanes_crud.api.dto.request.ClanGetReq;
import com.riwi.clanes_crud.domain.entities.Clan;
import com.riwi.clanes_crud.infrastructure.abstract_services.IClanService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/clan")
public class ClanController {

    private final IClanService iClanService;

    @GetMapping()
    public ResponseEntity<Page<Clan>> getAll(
            @RequestParam(defaultValue = "1")Integer page,
            @RequestParam(defaultValue = "3")Integer size,
            @RequestParam(defaultValue = "")String name,
            @RequestParam(defaultValue = "")String description,
            @RequestParam(required = false)Boolean isActive,
            @RequestParam(required = false)Long cohortId
    ){

        var req = ClanGetReq.builder()
                .page(page -1)
                .size(size)
                .name(name)
                .description(description)
                .isActive(isActive)
                .cohortId(cohortId)
                .build();

        return ResponseEntity.ok(this.iClanService.findAll(req));
    }


}
