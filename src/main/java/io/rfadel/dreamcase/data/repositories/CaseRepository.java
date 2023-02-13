package io.rfadel.dreamcase.data.repositories;

import io.rfadel.dreamcase.data.entities.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case, Long> {
}