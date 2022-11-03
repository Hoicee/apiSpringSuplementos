package com.example.demoClovis.model;


import javax.persistence.*;

@Entity
@Table
public class Suplementos {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column
    private String nome;
    @Column
    private String marca;
    @Column
    private int peso;

    public int getCODIGO() {
        return codigo;
    }

    public void setCODIGO(int CODIGO) {
        this.codigo = CODIGO;
    }

    public String getNOME() {
        return nome;
    }

    public void setNOME(String NOME) {
        this.nome = NOME;
    }

    public String getMARCA() {
        return marca;
    }

    public void setMARCA(String MARCA) {
        this.marca = MARCA;
    }

    public int getPESO() {
        return peso;
    }

    public void setPESO(int PESO) {
        this.peso = PESO;
    }
}
