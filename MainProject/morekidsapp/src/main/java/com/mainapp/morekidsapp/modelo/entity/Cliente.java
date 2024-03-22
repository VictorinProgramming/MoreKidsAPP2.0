package com.mainapp.morekidsapp.modelo.entity;

public class Cliente {
    private Long id;
    private String nome;
    private String telefone;
    private String genero;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String telefone, String genero) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
