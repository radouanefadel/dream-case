package io.rfadel.dreamcase.services.impl;

import io.rfadel.dreamcase.data.dtos.CaseInfoDto;
import io.rfadel.dreamcase.data.dtos.CreateOrUpdateCaseDto;
import io.rfadel.dreamcase.data.entities.Case;
import io.rfadel.dreamcase.data.mappers.CaseMapper;
import io.rfadel.dreamcase.data.repositories.CaseRepository;
import io.rfadel.dreamcase.services.CasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasesServiceImpl implements CasesService {
    @Autowired
    private CaseRepository repository;

    @Override
    public ResponseEntity<List<CaseInfoDto>> findAll() {
        final List<Case> cases = this.repository.findAll();
        return new ResponseEntity<>(
                CaseMapper.INSTANCE.toCaseInfoDTOs(cases),
                HttpStatus.OK
        );
    }

    @Override
    public ResponseEntity<CaseInfoDto> findOne(long id) {
        return null;
    }

    @Override
    public ResponseEntity<CaseInfoDto> create(CreateOrUpdateCaseDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<CaseInfoDto> update(long id, CreateOrUpdateCaseDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(long id) {
        return null;
    }
}
