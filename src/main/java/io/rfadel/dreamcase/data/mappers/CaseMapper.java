package io.rfadel.dreamcase.data.mappers;

import io.rfadel.dreamcase.data.dtos.CaseInfoDto;
import io.rfadel.dreamcase.data.entities.Case;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CaseMapper  {
    CaseMapper INSTANCE = Mappers.getMapper(CaseMapper.class);

    @Mapping(target = "creationDate", source = "creationDate", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(target = "lastUpdateDate", source = "lastUpdateDate", dateFormat = "yyyy-MM-dd HH:mm:ss")
    CaseInfoDto toCaseInfoDto(Case caseEntity);

    @IterableMapping(elementTargetType = CaseInfoDto.class)
    List<CaseInfoDto> toCaseInfoDTOs(List<Case> cases);
}
