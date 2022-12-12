package me.pianorang.em.core.event.application;

import me.pianorang.em.core.event.domain.Event;
import me.pianorang.em.core.event.domain.EventRepository;
import org.springframework.stereotype.Service;

@Service
class EventCrudService implements EventCrudPort {
    private final EventRepository eventRepository;
    public EventCrudService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
    @Override
    public Event save(EventCommand command) {
        return eventRepository.save(command.mapToEntity());
    }

    @Override
    public Event update(EventCommand command) {
        return eventRepository.findById(command.getId()).orElseThrow();
    }
    @Override
    public void delete(Long id) {
        Event event = eventRepository.findById(id)
                .orElseThrow();
        eventRepository.delete(event);
    }
}
