package com.jm.estacionamento.service;

import com.jm.estacionamento.model.Carro;
import com.jm.estacionamento.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> listarTodos() {
        return carroRepository.findAll();
    }

    public Optional<Carro> buscarPorId(Long id) {
        return carroRepository.findById(id);
    }

    public Carro criar(Carro carro) {
        return carroRepository.save(carro);
    }

    public Carro atualizar(Long id, Carro carroAtualizado) {
        return carroRepository.findById(id).map(carro -> {
            carro.setMatricula(carroAtualizado.getMatricula());
            carro.setMarca(carroAtualizado.getMarca());
            carro.setModelo(carroAtualizado.getModelo());
            carro.setCor(carroAtualizado.getCor());
            return carroRepository.save(carro);
        }).orElse(null);
    }

    public boolean remover(Long id) {
        return carroRepository.findById(id).map(carro -> {
            carroRepository.delete(carro);
            return true;
        }).orElse(false);
    }
}
