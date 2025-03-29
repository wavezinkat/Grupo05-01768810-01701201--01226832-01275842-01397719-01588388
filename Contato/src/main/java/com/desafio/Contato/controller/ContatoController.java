package com.desafio.Contato.controller;

import com.desafio.Contato.Contato.dto.ContatoDTO;
import com.desafio.Contato.model.Contato;
import com.desafio.Contato.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @GetMapping
    public List<Contato> listarTodos(){
        return contatoService.listarTodos();
    }

    @PostMapping
    public Contato create(@RequestBody Contato contato) {
        return contatoService.Create(contato);
    }

    @GetMapping("/{id}")
    public Contato listarPorId(@PathVariable Long id){
        return contatoService.listarPorId(id);
    }

    @PutMapping("/{id}")
    public Contato atualizarPorId(@PathVariable Long id, @RequestBody Contato contato) {
        return contatoService.atualizarPorId(id, contato);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        contatoService.deletePorId(id);
    }

    @PatchMapping("/{id}")
    public void favoritarPorId(@PathVariable Long id){
        contatoService.favoritarPorId(id);
    }

    @GetMapping
    public Map<Character, List<Contato>> listarPorLetra(){
        return contatoService.listarPorLetra();
    }

    @PostMapping
        public ResponseEntity<String> criarContato(@RequestBody @Valid ContatoDTO contatoDTO) {
            // Aqui você pode chamar o serviço para salvar o contato
            return ResponseEntity.ok("Contato criado com sucesso!");
        }

}
