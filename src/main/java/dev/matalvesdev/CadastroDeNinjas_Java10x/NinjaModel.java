package dev.matalvesdev.CadastroDeNinjas_Java10x;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}

