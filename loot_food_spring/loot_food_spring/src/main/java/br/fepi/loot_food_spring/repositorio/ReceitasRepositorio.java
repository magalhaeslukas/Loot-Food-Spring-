package br.fepi.loot_food_spring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fepi.loot_food_spring.model.Receitas;

public interface ReceitasRepositorio extends JpaRepository<Receitas, Long> {
    
}
