package main.java.com.jm_estacionamento.service;

import com.jm_estacionamento.model.Utilizador;
import com.jm_estacionamento.repository.UtilizadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilizadorService {

    @Autowired
    private UtilizadorRepository utilizadorRepository;

    public List<Utilizador> listarTodos() {
        return utilizadorRepository.findAll();
    }

    public Optional<Utilizador> buscarPorId(Long id) {
        return utilizadorRepository.findById(id);
    }

    public Utilizador criar(Utilizador utilizador) {
        return utilizadorRepository.save(utilizador);
    }

    public Utilizador atualizar(Long id, Utilizador utilizador) {
        return utilizadorRepository.findById(id).map( existente -> {
            existente.setNome(utilizador.getNome());
            existente.setEmail(utilizador.getEmail());
            existente.setPassword(utilizador.getPassword());
            return utilizadorRepository.save(existente);
        }).orElse(null);
    }

    public boolean remover(Long id) {
        return utilizadorRepository.findById(id).map( existente -> {
            utilizadorRepository.delete(existente);
            return true;
        }).orElse(false);
    }
}