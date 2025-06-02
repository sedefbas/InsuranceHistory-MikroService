package com.example.sigorta_gecmisi_servisi.model.mapper;

import com.example.sigorta_gecmisi_servisi.model.InsuranceHistory;
import com.example.sigorta_gecmisi_servisi.model.entity.InsuranceHistoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;



@Mapper
public interface InsuranceHistoryToEntityMapper extends BaseMapper<InsuranceHistory, InsuranceHistoryEntity> {
    static InsuranceHistoryToEntityMapper initialize(){
        return Mappers.getMapper(InsuranceHistoryToEntityMapper.class);
    }
}
