package com.senac.br.crud.simples.controller;

import com.senac.br.crud.simples.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String FazerLogin (Login login){
        return "index";
    }
}
