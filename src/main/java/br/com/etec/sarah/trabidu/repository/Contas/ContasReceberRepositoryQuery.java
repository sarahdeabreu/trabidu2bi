package br.com.etec.sarah.trabidu.repository.Contas;

import br.com.etec.sarah.trabidu.repository.filter.ContasReceberFilter;
import br.com.etec.sarah.trabidu.repository.projections.ContasDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContasReceberRepositoryQuery {
public Page<ContasDto> filtrar(ContasReceberFilter contasReceberFilter, Pageable pageable);
}
