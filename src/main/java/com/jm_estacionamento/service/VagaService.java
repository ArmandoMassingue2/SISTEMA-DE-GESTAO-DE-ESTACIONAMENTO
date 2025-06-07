package com.estacionamento.service;

import com.estacionamento.model.Vaga;
import com.estacionamento.repository.VagaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VagaService {

    private final VagaRepository repository;

    public VagaService(VagaRepository repository) {
        this.repository = repository;
    }

    public List<Vaga> listarTodas() {
        return repository.findAll();
    }

    public Vaga criar(Vaga vaga) {
        return repository.save(vaga);
    }

    public Optional<Vaga> obterPorId(Long id) {
        return repository.findById(id);
    }

    public Vaga atualizar(Long id, Vaga novaVaga) {
        Vaga vaga = repository.findById(id).orElseThrow();
        vaga.setOcupada(novaVaga.getOcupada());
        vaga.setNumero(novaVaga.getNumero());
        return repository.save(vaga);
    }

    public void remover(Long id) {
        repository.deleteById(id);
    }
}
