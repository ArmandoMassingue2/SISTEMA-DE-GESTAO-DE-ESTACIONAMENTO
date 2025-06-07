package main.java.com.jm_estacionamento.repository;

import com.jm_estacionamento.model.Utilizador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilizadorRepository extends JpaRepository<Utilizador, Long> {
}