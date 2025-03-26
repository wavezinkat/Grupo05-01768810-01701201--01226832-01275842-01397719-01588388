package com.desafio.Contato.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 200)
    private String nome;

    @Column(length = 100)
    private String email;

    @Column(length = 20)
    private String celular;

    @Column(length = 20)
    private String telefone;

    @Column
    private Boolean ativo;

    @Column
    private LocalDate dataCadastro;

    @Column
    public Boolean favorito;

    @PrePersist
    public void onsave(){
        setAtivo(true);
        setDataCadastro(LocalDate.now());
    }

    private void setDataCadastro(LocalDate now) {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;}
    public Boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }
    public Boolean getFavorito() {
        return favorito;
    }
}
