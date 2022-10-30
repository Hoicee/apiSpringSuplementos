package com.example.demoClovis.model;

import javax.persistence.*;

@Entity
@Table
public class Fornecedores {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int CODIGO;

    @Column
    private String NOME;

    @Column
    private String ESTADO;

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

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }
}
