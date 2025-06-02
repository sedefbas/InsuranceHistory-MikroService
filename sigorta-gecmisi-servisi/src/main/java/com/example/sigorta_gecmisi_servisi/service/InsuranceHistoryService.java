package com.example.sigorta_gecmisi_servisi.service;

import com.example.sigorta_gecmisi_servisi.dto.request.InsuranceHistoryRequest;
import com.example.sigorta_gecmisi_servisi.dto.response.InsuranceHistoryResponse;
import com.example.sigorta_gecmisi_servisi.model.InsuranceHistory;

import java.util.List;


public interface InsuranceHistoryService {
    InsuranceHistory create(InsuranceHistoryRequest request);  // Request alır
    InsuranceHistory getById(Long id);
    List<InsuranceHistory> getAll();
    InsuranceHistory update(Long id, InsuranceHistoryRequest request);
    void delete(Long id);
}

