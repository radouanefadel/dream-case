package io.rfadel.dreamcase.data.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CaseInfoDto {
    private long caseId;
    private String title;
    private String description;
    private String creationDate;
    private String lastUpdateDate;
}
