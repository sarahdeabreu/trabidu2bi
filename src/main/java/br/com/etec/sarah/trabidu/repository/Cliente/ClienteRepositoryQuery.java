package br.com.etec.sarah.trabidu.repository.Cliente;

import br.com.etec.sarah.trabidu.model.Cliente;
import br.com.etec.sarah.trabidu.repository.filter.ClienteFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClienteRepositoryQuery {
  public Page<Cliente> Filtrar(ClienteFilter clienteFilter, Pageable pageable);
}
