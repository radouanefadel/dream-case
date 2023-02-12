package io.rfadel.dreamcase.data.dtos;

import javax.validation.constraints.NotNull;

public class CreateOrUpdateCaseDto {
    private long case_id;
    @NotNull
    private String title;

    private String description;
}
