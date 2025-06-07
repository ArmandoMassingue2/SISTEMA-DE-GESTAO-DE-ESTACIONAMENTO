package main.java.com.jm_estacionamento.model;

import jakarta.persistence.*;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String matricula;
    private String marca;
    private String modelo;
    private String cor;

    public Carro() {}

    public Carro(String matricula, String marca, String modelo, String cor) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
}