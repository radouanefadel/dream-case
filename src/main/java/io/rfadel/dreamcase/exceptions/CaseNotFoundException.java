package io.rfadel.dreamcase.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CaseNotFoundException extends RuntimeException {
    public CaseNotFoundException(final Long id) {
        super(String.format("Case (%d) not found!", id));
    }
}
