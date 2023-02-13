package io.rfadel.dreamcase.services;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BaseService<T, U> {
    ResponseEntity<List<T>> findAll();
    ResponseEntity<T> findOne(final long id);
    ResponseEntity<T> create(U dto);
    ResponseEntity<T> update(final long id, final U dto);
    ResponseEntity<?> delete(final long id);
}
