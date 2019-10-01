package com.security.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Home {

    @RequestMapping(value = {"/", "/home", "/index"}, method = RequestMethod.GET)
    public String home(Model model) {
        return "index";
    }

    @RequestMapping(value = {"/about"}, method = RequestMethod.GET)
    public String about(Model model) {
        return "about";
    }

    @RequestMapping(value = "employees", method = RequestMethod.GET)
    public String employeesList(Model model) {
        return "employees";
    }

    @GetMapping(value="/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping(value = "/logout-success")
    public String logout() {
        return "logout";
    }
}
