package com.riwi.clanes_crud.infrastructure.services;

import com.riwi.clanes_crud.api.dto.request.ClanGetReq;
import com.riwi.clanes_crud.api.dto.request.ClanReq;
import com.riwi.clanes_crud.api.dto.request.ClanUpdateRequest;
import com.riwi.clanes_crud.domain.entities.Clan;
import com.riwi.clanes_crud.domain.repositories.ClanRepository;
import com.riwi.clanes_crud.infrastructure.abstract_services.IClanService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClanService implements IClanService {

    private final ClanRepository clanRepository;

    @Override
    public Page<Clan> findAll(ClanGetReq request) {

        if (request.getPage() < 0) request.setPage(0);

        PageRequest pagination = PageRequest.of(request.getPage(), request.getSize());

        return this.clanRepository.getAll(
                request.getName(),
                request.getDescription(),
                request.getIsActive(),
                request.getCohortId(),
                pagination
        );
    }

    @Override
    public Clan create(ClanReq request) {
        return null;
    }

    @Override
    public Clan update(Long id, ClanUpdateRequest request) {
        return null;
    }

    @Override
    public Clan disable(Long id) {
        return null;
    }
}
