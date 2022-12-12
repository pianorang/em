package me.pianorang.em.core.event.domain;

import me.pianorang.em.core.event.application.EventCommand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EventRepository {
    Page<Event> findAll(Pageable pageable);
    Optional<Event> findById(Long id);
    Event save(Event event);
    void delete(Event event);
}
