package com.example.agenda.controller;

import com.example.agenda.model.Contato;
import com.example.agenda.repository.ContatoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    private final ContatoRepository repository;

    public ContatoController(ContatoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Contato criarContato(@RequestBody Contato contato) {
        return repository.save(contato);
    }

    @GetMapping
    public List<Contato> listarContatos() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contato> atualizarContato(@PathVariable Long id, @RequestBody Contato contatoAtualizado) {
        Optional<Contato> contato = repository.findById(id);
        if (contato.isPresent()) {
            Contato c = contato.get();
            c.setNome(contatoAtualizado.getNome());
            c.setEmail(contatoAtualizado.getEmail());
            c.setTelefone(contatoAtualizado.getTelefone());
            return ResponseEntity.ok(repository.save(c));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarContato(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}