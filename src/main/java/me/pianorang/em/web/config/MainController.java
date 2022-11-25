package me.pianorang.em.web.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/main")
    public String main(){
        return "admin/main";
    }
}
