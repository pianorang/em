package me.pianorang.em.admin.web;

import me.pianorang.em.admin.common.AdminController;
import me.pianorang.em.core.event.application.EventCommand;
import me.pianorang.em.core.event.domain.Event;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@AdminController
public class AdminEventController {
    @GetMapping("/event")
    public String list(Model model){
        return "admin/event/event_list";
    }

    @GetMapping("/event/participants")
    public String participants(Model model){
        return "admin/event/participants_list";
    }
}
