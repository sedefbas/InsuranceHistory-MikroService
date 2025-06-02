package com.example.sigorta_gecmisi_servisi.service;

import com.example.sigorta_gecmisi_servisi.client.ClaimClient;
import com.example.sigorta_gecmisi_servisi.model.dto.request.InsuranceHistoryRequest;
import com.example.sigorta_gecmisi_servisi.model.InsuranceHistory;
import com.example.sigorta_gecmisi_servisi.model.entity.InsuranceHistoryEntity;
import com.example.sigorta_gecmisi_servisi.model.mapper.InsuranceHistoryEntityToDomainMapper;
import com.example.sigorta_gecmisi_servisi.model.mapper.InsuranceHistoryRequestToDomainMapper;
import com.example.sigorta_gecmisi_servisi.model.mapper.InsuranceHistoryToEntityMapper;
import com.example.sigorta_gecmisi_servisi.repository.InsuranceHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service

public class InsuranceHistoryServiceImpl implements InsuranceHistoryService {

   // private final ClaimClient claimClient;
    private final InsuranceHistoryRepository insuranceHistoryRepository;
    private final InsuranceHistoryEntityToDomainMapper insuranceHistoryMapper;
    private final InsuranceHistoryToEntityMapper insuranceHistoryToEntityMapper;
    private final  InsuranceHistoryRequestToDomainMapper insuranceHistoryRequestToDomainMapper;

    public InsuranceHistoryServiceImpl(InsuranceHistoryRepository insuranceHistoryRepository, InsuranceHistoryEntityToDomainMapper insuranceHistoryMapper, InsuranceHistoryToEntityMapper insuranceHistoryToEntityMapper, InsuranceHistoryRequestToDomainMapper insuranceHistoryRequestToDomainMapper) {
        this.insuranceHistoryRepository = insuranceHistoryRepository;
        this.insuranceHistoryMapper = insuranceHistoryMapper;
        this.insuranceHistoryToEntityMapper = insuranceHistoryToEntityMapper;
        this.insuranceHistoryRequestToDomainMapper = insuranceHistoryRequestToDomainMapper;
    }
    @Override
    public InsuranceHistory create(InsuranceHistoryRequest request) {
        // Request DTO'dan Domain modeline çevir
        InsuranceHistory domain = insuranceHistoryRequestToDomainMapper.map(request);

        // Oluşturma ve güncelleme tarihlerini ayarla
        LocalDateTime now = LocalDateTime.now();
        domain.setCreatedAt(now);
        domain.setUpdatedAt(now);

        // Domain modelinden Entity'e çevir
        InsuranceHistoryEntity entity = insuranceHistoryToEntityMapper.map(domain);

        // Kaydet
        InsuranceHistoryEntity savedEntity = insuranceHistoryRepository.save(entity);

        // Entity'den Domain modeline çevir ve döndür
        return insuranceHistoryMapper.map(savedEntity);
    }


    @Override
    public InsuranceHistory getById(Long id) {
        var entity = insuranceHistoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("InsuranceHistory not found: " + id));

        return insuranceHistoryMapper.map(entity);
    }

    @Override
    public List<InsuranceHistory> getAll() {
        var entities = insuranceHistoryRepository.findAll();
        return entities.stream()
                .map(insuranceHistoryMapper::map)
                .toList();
    }

    @Override
    public InsuranceHistory update(Long id, InsuranceHistoryRequest request) {
        InsuranceHistoryEntity existingEntity = insuranceHistoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("InsuranceHistory not found: " + id));

        InsuranceHistory updatedDomain = insuranceHistoryRequestToDomainMapper.map(request);

        InsuranceHistoryEntity updatedEntity = insuranceHistoryToEntityMapper.map(updatedDomain);

        updatedEntity.setId(existingEntity.getId());

        InsuranceHistoryEntity savedEntity = insuranceHistoryRepository.save(updatedEntity);

        return insuranceHistoryMapper.map(savedEntity);
    }




    @Override
    public void delete(Long id) {
        if (!insuranceHistoryRepository.existsById(id)) {
            throw new RuntimeException("InsuranceHistory not found: " + id);
        }
        insuranceHistoryRepository.deleteById(id);
    }
}
