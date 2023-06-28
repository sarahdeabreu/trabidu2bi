package br.com.etec.sarah.trabidu.repository;

import br.com.etec.sarah.trabidu.model.ContasReceber;
import br.com.etec.sarah.trabidu.repository.Contas.ContasReceberRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContasReceberRepository extends JpaRepository<ContasReceber,Integer>, ContasReceberRepositoryQuery {
}
