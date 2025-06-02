package com.example.sigorta_gecmisi_servisi.service;

import com.example.sigorta_gecmisi_servisi.client.ClaimClient;
import com.example.sigorta_gecmisi_servisi.dto.request.InsuranceHistoryRequest;
import com.example.sigorta_gecmisi_servisi.dto.response.InsuranceHistoryResponse;
import com.example.sigorta_gecmisi_servisi.model.InsuranceHistory;
import com.example.sigorta_gecmisi_servisi.model.mapper.InsuranceHistoryEntityToDomainMapper;
import com.example.sigorta_gecmisi_servisi.repository.InsuranceHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InsuranceHistoryServiceImpl implements InsuranceHistoryService{
    private final ClaimClient claimClient;
    private final InsuranceHistoryRepository insuranceHistoryRepository;
    private final InsuranceHistoryEntityToDomainMapper insuranceHistoryMapper;


    @Override
    public InsuranceHistory create(InsuranceHistoryRequest request) {
        return null;
    }

    @Override
    public InsuranceHistory getById(Long id) {
        return null;
    }

    @Override
    public List<InsuranceHistory> getAll() {
        return List.of();
    }

    @Override
    public InsuranceHistory update(Long id, InsuranceHistoryRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
