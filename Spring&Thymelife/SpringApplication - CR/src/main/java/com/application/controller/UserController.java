package com.application.controller;


import com.application.entity.User;
import com.application.repository.RoleRepository;
import com.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RoleRepository roleRepository;

    @GetMapping({"/", "/login"})
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/userForm", method = RequestMethod.POST)
    public String getUserForm(Model model) {
        model.addAttribute("userForm", new User());
        model.addAttribute("roles",roleRepository.findAll());
        model.addAttribute("userList", userService.getAllUsers());
        model.addAttribute("formTab","active");
        return "user-form/user-view";
    }

}
