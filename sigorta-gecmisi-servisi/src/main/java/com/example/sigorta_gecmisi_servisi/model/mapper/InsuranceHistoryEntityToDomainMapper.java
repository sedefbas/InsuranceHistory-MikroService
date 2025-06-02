package com.example.sigorta_gecmisi_servisi.model.mapper;

import com.example.sigorta_gecmisi_servisi.model.InsuranceHistory;
import com.example.sigorta_gecmisi_servisi.model.entity.InsuranceHistoryEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface InsuranceHistoryEntityToDomainMapper extends BaseMapper<InsuranceHistoryEntity, InsuranceHistory> {

}
