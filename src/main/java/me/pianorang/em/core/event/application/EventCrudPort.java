package me.pianorang.em.core.event.application;

import me.pianorang.em.core.event.domain.Event;

public interface EventCrudPort {
    Event save(EventCommand command);
}
