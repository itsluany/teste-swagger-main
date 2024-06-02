package br.com.luh.testeswagger.controller;

import br.com.luh.testeswagger.dto.UsuarioDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class SwaggerController {


    @GetMapping("/exibe-nome")
    public String ExibirNome(@RequestParam String nome){
        return "O nome informado é: " + nome;
    }

    @PostMapping("/lista-nomes")
    public List<UsuarioDto> ExibirListaNomes(@RequestBody List<UsuarioDto> listaNomes){
        return listaNomes;
    }

    @GetMapping("/exibir-idade")
    public String MostrarIdade(@RequestParam int idade){
        return "A indade informada é: " + idade;
    }

}
