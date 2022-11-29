package me.pianorang.em.core.event.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.pianorang.em.core.user.domain.User;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="T_EVENTS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private boolean isClosed;

    public Long getId() {
        return id;
    }

    public static Event create(Long id, String title, String description, LocalDateTime startDate
                               ,LocalDateTime endDate, boolean isClosed){
        return new Event(id, title, description, startDate, endDate, isClosed);
    }
}
