package me.pianorang.em.admin.web;

import jakarta.validation.Valid;
import me.pianorang.em.admin.common.AdminController;
import me.pianorang.em.core.user.application.UserCommand;
import me.pianorang.em.core.user.application.UserEditor;
import me.pianorang.em.core.user.domain.User;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@AdminController
public class AdminUserController {
    private final UserEditor userEditor;

    public AdminUserController(UserEditor userEditor) {
        this.userEditor = userEditor;
    }

    @GetMapping("/user")
    public String list(){
        return "admin/user/user_list";
    }

    @GetMapping("/user/new")
    public String createForm(Model model){
        model.addAttribute("user", new UserCommand());
        return "admin/user/user_form";
    }

    @PostMapping("/user/new")
    public String create(@Valid UserCommand user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "admin/user/user_form";
        }
        userEditor.create(user);
        return "redirect:/admin/user";
    }
}
