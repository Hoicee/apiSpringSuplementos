package com.example.demoClovis.controller;

import com.example.demoClovis.model.Suplementos;
import com.example.demoClovis.repository.SupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/apiSup")
public class SupController {

    @Autowired
    SupRepository supRepository;

    @GetMapping(value="/suplementos")
    public List<Suplementos> listarSuplementos() {
        return supRepository.findAll();
    }
}
