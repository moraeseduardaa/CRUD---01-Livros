package com.moraes.livros.controller;

import com.moraes.livros.model.LivroModel;
import com.moraes.livros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public LivroModel criarLivro(@RequestBody LivroModel livroModel){
        return livroService.criarLivro(livroModel);
    }

    @GetMapping
    public List<LivroModel> listarLivros(){
        return livroService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<LivroModel> buscarLivro(@PathVariable  Long id){
        return livroService.buscarLivro(id);
    }

    @DeleteMapping("/{id}")
    public void deletarLivro(@PathVariable Long id){
        livroService.deletarLivro(id);
    }
}
