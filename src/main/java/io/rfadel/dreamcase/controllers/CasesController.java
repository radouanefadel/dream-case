package io.rfadel.dreamcase.controllers;

import io.rfadel.dreamcase.data.dtos.CaseInfoDto;
import io.rfadel.dreamcase.services.CasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/cases")
public class CasesController {
    @Autowired
    private CasesService service;

    @GetMapping("")
    public ResponseEntity<List<CaseInfoDto>> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CaseInfoDto> findOne(@Valid @PathVariable long id) {
        return this.service.findOne(id);
    }
}
