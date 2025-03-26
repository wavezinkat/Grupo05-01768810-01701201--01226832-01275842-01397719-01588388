package com.desafio.Contato.service;

import com.desafio.Contato.model.Contato;
import com.desafio.Contato.repository.ContatoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public List<Contato> listarTodos(){
        return contatoRepository.findAll();
    }


    public Contato Create(Contato contato) {
        contato = contatoRepository.save(contato);
        return contato;
    }

    public Contato listarPorId(Long id) {
        Optional<Contato> optionalContato = contatoRepository.findById(id);
        return optionalContato.orElseThrow(() -> new RuntimeException("contato nao encontrado"));
    }

    public Contato atualizarPorId(Long id, Contato contato) {
        Contato contatoSalvo = listarPorId(id);

        contato.setId(id);
        BeanUtils.copyProperties(contato, contatoSalvo);

        contatoRepository.save(contatoSalvo);
        return contatoSalvo;
    }


    public void deletePorId(Long id) {
        Contato contato = listarPorId(id);
        contatoRepository.delete(contato);
    }


    public void favoritarPorId(Long id) {
        Contato contato = listarPorId(id);
        contato.setFavorito(true);
        contatoRepository.save(contato);
    }

    public Map<Character, List<Contato>> listarPorLetra() {
        List<Contato> contatos = contatoRepository.findAll();

        return  contatos.stream()
                .filter(Contato::getAtivo)
                .filter(contato -> contato.getNome() != null && !contato.getNome().isEmpty())
                .collect(Collectors.groupingBy(contato -> {
                    char letra = contato.getNome().toUpperCase().charAt(0);
                    return Character.toUpperCase(letra);
                }));
    }
}
