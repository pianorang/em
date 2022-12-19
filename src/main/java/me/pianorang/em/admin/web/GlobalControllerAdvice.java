package me.pianorang.em.admin.web;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalControllerAdvice {
    @ModelAttribute("requestUrl")
    public String requestUrl(HttpServletRequest request) {
        return request.getRequestURI();
    }

}
