package me.pianorang.em.admin.web;

import me.pianorang.em.admin.common.AdminController;
import org.springframework.web.bind.annotation.GetMapping;

@AdminController
public class AdminMainController {
    @GetMapping(value = {"", "/"})
    public String main(){
        return "admin/index";
    }

    @GetMapping("/me")
    public String me(){
        return "admin/me";
    }
}
