package me.pianorang.em.admin.web.api;

import lombok.extern.slf4j.Slf4j;
import me.pianorang.em.admin.common.AdminRestController;
import me.pianorang.em.core.event.application.EventCommand;
import me.pianorang.em.core.event.application.EventCrudPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@AdminRestController
public class EventCrudController {
    private final EventCrudPort eventCrudPort;

    public EventCrudController(EventCrudPort eventCrudPort) {
        this.eventCrudPort = eventCrudPort;
    }

    @PostMapping("/event/new")
    public void create(EventCommand event){
        log.debug("!! create event");
        eventCrudPort.save(event);
    }

    @PostMapping("/event/update/{id}")
    public void update(@PathVariable Long id, EventCommand event){
        log.debug("!! update event");
        eventCrudPort.update(event);
    }

    @GetMapping("/event/delete/{id}")
    public void delete(@PathVariable Long id){
        log.debug("!! delete event");

        eventCrudPort.delete(id);
    }



}
