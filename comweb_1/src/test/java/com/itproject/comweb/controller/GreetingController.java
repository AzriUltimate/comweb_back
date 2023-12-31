package com.itproject.comweb.controller;

import com.itproject.comweb.entity.UserEntity;
import com.itproject.comweb.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;

@EnableJpaRepositories(basePackages = "com.itproject.comweb.repository")
@Controller
public class GreetingController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model
    ) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<UserEntity> users = userRepo.findAll();
        model.put("users", users);
        return "main";
    }

    @PostMapping
    public String add(@RequestParam String name, @RequestParam String password, Map<String, Object> model){
        UserEntity userEntity = new UserEntity(name, password);

        userRepo.save(userEntity);

        Iterable<UserEntity> users = userRepo.findAll();

        model.put("users", users);

        return "main";
    }
}