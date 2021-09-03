package br.edu.cesmac.si.atividade.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPessoa")
    private Long id;
    @NotEmpty(message = "É Obrigatório nos informar seu nome!")
    private String nome;
    @Column
    @NotEmpty(message = "Email inválido!")
    @Email(message = "Email inválido!")
    private String email;
    @Temporal(TemporalType.DATE)
    private String dataNascimento;
    @Column
    private String sexo;

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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
