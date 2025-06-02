package com.example.sigorta_gecmisi_servisi.model.mapper;

import com.example.sigorta_gecmisi_servisi.model.InsuranceHistory;
import com.example.sigorta_gecmisi_servisi.model.entity.InsuranceHistoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InsuranceHistoryEntityToDomainMapper extends BaseMapper<InsuranceHistoryEntity, InsuranceHistory> {
    static InsuranceHistoryEntityToDomainMapper initialize(){
        return Mappers.getMapper(InsuranceHistoryEntityToDomainMapper.class);
    }
}
