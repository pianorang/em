package me.pianorang.em.core.event.application;

import me.pianorang.em.core.event.domain.Event;
import me.pianorang.em.core.event.domain.EventRepository;
import org.springframework.stereotype.Service;

@Service
class EventCrudService implements EventCrudPort {

    public EventCrudService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    private final EventRepository eventRepository;

    @Override
    public Event save(EventCommand command) {
        return eventRepository.save(command.mapToEntity());
    }
}
