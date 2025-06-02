package com.example.sigorta_gecmisi_servisi.model.mapper;

import com.example.sigorta_gecmisi_servisi.model.dto.request.InsuranceHistoryRequest;
import com.example.sigorta_gecmisi_servisi.model.InsuranceHistory;
import org.mapstruct.Mapper;




@Mapper(componentModel = "spring")
public interface InsuranceHistoryRequestToDomainMapper extends BaseMapper<InsuranceHistoryRequest, InsuranceHistory> {

}
