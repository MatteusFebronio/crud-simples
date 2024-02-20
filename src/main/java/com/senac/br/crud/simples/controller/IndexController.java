package com.senac.br.crud.simples.controller;

import com.senac.br.crud.simples.model.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/cad_pessoa")
    public String abrirCadastroPessoa(Pessoa pessoa) {
        return "cadastro_pessoa";

    }
        @GetMapping("/")
        public String abrirIndex(){
            return "index";
        }

        @GetMapping("/login")
        public String getLoginPage() {
            return "index";
        }

        @GetMapping("/login-sucess")
        public String getLoginSucess() {
            return "inicio";
        }

        @GetMapping("/admin")
        public String getPaginaAdmin() {
            return "administrador";
        }

        @GetMapping("/user-comum")
        public String getPaginaComum() {
            return "comum";
    }

}
