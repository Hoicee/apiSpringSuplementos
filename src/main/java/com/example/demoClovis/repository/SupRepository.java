package com.example.demoClovis.repository;

import com.example.demoClovis.model.Suplementos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface SupRepository extends JpaRepository <Suplementos, Integer> {

    public List<Suplementos> findByNome(String nome);

    @Query("select s from Suplementos s where s.codigo > ?1")
    public List<Suplementos> findByCodMaior(int codigo);

    @Query("select s from suplementos s where s.nome like '%?1%'")
    public List<Suplementos> findByNomeFiltro(String nome);


}
