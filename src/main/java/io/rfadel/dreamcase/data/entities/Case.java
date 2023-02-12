package io.rfadel.dreamcase.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cases")
@Getter
@Setter
public class Case {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long caseId;
    @Column(unique = true, nullable = false)
    private String title;

    @Column(nullable = true)
    private String description;

    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "last_update_date", nullable = true)
    private LocalDateTime lastUpdateDate;

    @PrePersist
    public void prePersist() {
        if (this.creationDate == null) {
            this.creationDate = LocalDateTime.now();
        }
    }
}