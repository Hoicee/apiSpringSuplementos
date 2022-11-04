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

    @GetMapping("/suplementos")
    public List<Suplementos> listarSuplementos() { return supRepository.findAll();  }

    @GetMapping("/listarSupNome/{nome}")
    public List<Suplementos> listarSupPorNome (@PathVariable("nome") String nome) { return supRepository.findByNome(nome); }

    @PostMapping("/inserirSuplemento")
    public void inserirSuplemento (@RequestBody Suplementos s) { supRepository.save(s); }

    @GetMapping("/removerSuplemento/{id}")
    public void removerSuplemento (@PathVariable("id") int id) { supRepository.deleteById(id); }

    @PutMapping("/atualizarSuplemento")
    public void atualizarSuplemento (@RequestBody Suplementos s) { supRepository.save(s); }

    @GetMapping("/codMaior/{codigo}")
    public List<Suplementos> listarPorCodMaior (@PathVariable("codigo") int codigo) { return supRepository.findByCodMaior(codigo);}

    @GetMapping("/listarSupPesquisa/{nome}")
    public List<Suplementos> listarPorPesquisa (@PathVariable("nome") String nome) { return supRepository.findByNomeFiltro(nome);}

    @GetMapping("/listaNomeCod/{codigo}/{nome}")
    public List<String> listarNomeCod (@PathVariable("codigo") int codigo,
                                       @PathVariable("nome") String nome)
    {
        return supRepository.FindByNomeCod(codigo, nome);
    }
}
