package me.pianorang.em.core.event.domain;

import me.pianorang.em.core.event.application.EventCommand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EventRepository {
    Page<Event> findAll(Pageable pageable);

    Event save(Event event);
}
