package br.fepi.loot_food_spring.controller;

import br.fepi.loot_food_spring.repositorio.ReceitasRepositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.fepi.loot_food_spring.model.Receitas;

@RestController
@RequestMapping("/produtos")
public class ReceitasControler {

    @Autowired
    private ReceitasRepositorio repositorio;

    @GetMapping
    public List<Receitas> listar(){
        return repositorio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Receitas> listarPeloId(@RequestParam(name="id") final Long id){
        return repositorio.findById(id);
    }

    @PostMapping
    public Receitas adicionar(@RequestBody Receitas produtos){
        return repositorio.save(produtos);
    }

    @PutMapping
    public Receitas alterar(@RequestBody Receitas produtos){
        if(produtos.getId()>0)
            return repositorio.save(produtos);
        return null;
    }

    @DeleteMapping
    public String deletar(@RequestBody Receitas produtos){
        if(produtos.getId()>0){
            repositorio.delete(produtos);
            return "Removido com sucesso";
        }
        return "Usuario não encontrado";
    }
}
