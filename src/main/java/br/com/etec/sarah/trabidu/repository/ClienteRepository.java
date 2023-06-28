package br.com.etec.sarah.trabidu.repository;

import br.com.etec.sarah.trabidu.model.Cliente;
import br.com.etec.sarah.trabidu.repository.Cliente.ClienteRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>, ClienteRepositoryQuery {
}
