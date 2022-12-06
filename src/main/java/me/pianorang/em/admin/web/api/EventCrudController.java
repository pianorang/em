package me.pianorang.em.admin.web.api;

import me.pianorang.em.admin.common.AdminRestController;
import me.pianorang.em.core.event.application.EventCommand;
import me.pianorang.em.core.event.application.EventCrudPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@AdminRestController
public class EventCrudController {
    private final EventCrudPort eventCrudPort;

    public EventCrudController(EventCrudPort eventCrudPort) {
        this.eventCrudPort = eventCrudPort;
    }

    @PostMapping("/event/new")
    public void create(EventCommand event){
        eventCrudPort.save(event);
    }



}
