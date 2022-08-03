package br.com.example.apiwithpostgresheroku.repositories;


import br.com.example.apiwithpostgresheroku.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
