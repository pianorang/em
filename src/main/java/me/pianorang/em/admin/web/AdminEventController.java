package me.pianorang.em.admin.web;

import me.pianorang.em.admin.common.AdminController;
import org.springframework.web.bind.annotation.GetMapping;

@AdminController
public class AdminEventController {
    @GetMapping("/event")
    public String list(){
        return "admin/event/event_list";
    }

}
