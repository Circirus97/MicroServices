package com.riwi.clanes_crud.infrastructure.abstract_services;

import com.riwi.clanes_crud.api.dto.request.ClanGetReq;
import com.riwi.clanes_crud.api.dto.request.ClanReq;
import com.riwi.clanes_crud.api.dto.request.ClanUpdateRequest;
import com.riwi.clanes_crud.domain.entities.Clan;
import org.springframework.data.domain.Page;

public interface IClanService {

    Page<Clan> findAll(ClanGetReq request);

    Clan create(ClanReq request);

    Clan update(Long id, ClanUpdateRequest request);

    Clan disable(Long id);
}
