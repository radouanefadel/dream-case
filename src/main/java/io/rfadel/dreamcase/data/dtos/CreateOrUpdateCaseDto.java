package io.rfadel.dreamcase.data.dtos;

import javax.validation.constraints.NotNull;

public class CreateOrUpdateCaseDto {
    @NotNull
    private String title;

    private String description;
}
