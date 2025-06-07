package main.java.com.jm_estacionamento.repository;

import com.jm_estacionamento.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}