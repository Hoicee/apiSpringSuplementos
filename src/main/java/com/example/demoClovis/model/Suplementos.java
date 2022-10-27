package com.example.demoClovis.model;


import javax.persistence.*;

@Entity
@Table
public class Suplementos {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int CODIGO;
    @Column
    private String NOME;
    @Column
    private String MARCA;
    @Column
    private int PESO;

    public int getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(int CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getMARCA() {
        return MARCA;
    }

    public void setMARCA(String MARCA) {
        this.MARCA = MARCA;
    }

    public int getPESO() {
        return PESO;
    }

    public void setPESO(int PESO) {
        this.PESO = PESO;
    }
}
