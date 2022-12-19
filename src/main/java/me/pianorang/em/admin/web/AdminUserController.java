package me.pianorang.em.admin.web;

import me.pianorang.em.admin.common.AdminController;
import org.springframework.web.bind.annotation.GetMapping;

@AdminController
public class AdminUserController {
    @GetMapping("/user")
    public String list(){
        return "admin/user/user_list";
    }
}
