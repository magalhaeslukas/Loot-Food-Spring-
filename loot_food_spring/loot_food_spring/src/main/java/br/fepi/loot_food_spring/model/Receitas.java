package br.fepi.loot_food_spring.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Receitas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String ingredientes;

    @Column(nullable = false)
    private String modo_preparo;
    
    @Column(nullable = false)
    private Time tempo_preparo;


    public Receitas(Long id, String nome, String ingredientes, String modo_preparo, Time tempo_preparo) {
        this.id = id;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.modo_preparo = modo_preparo;
        this.tempo_preparo = tempo_preparo;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModo_preparo() {
        return this.modo_preparo;
    }

    public void setModo_preparo(String modo_preparo) {
        this.modo_preparo = modo_preparo;
    }

    public Time getTempo_preparo() {
        return this.tempo_preparo;
    }

    public void setTempo_preparo(Time tempo_preparo) {
        this.tempo_preparo = tempo_preparo;
    }
}
