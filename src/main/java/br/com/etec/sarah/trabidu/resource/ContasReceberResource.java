package br.com.etec.sarah.trabidu.resource;

import br.com.etec.sarah.trabidu.model.ContasReceber;
import br.com.etec.sarah.trabidu.repository.ContasReceberRepository;
import br.com.etec.sarah.trabidu.repository.filter.ContasReceberFilter;
import br.com.etec.sarah.trabidu.repository.projections.ContasDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContasReceberResource {


  @Autowired
  private ContasReceberRepository contasReceberRepository;

  @GetMapping("/todos")
  public List<ContasReceber> ListarTodasAsContas(){
  return contasReceberRepository.findAll();
  }


@GetMapping
public Page<ContasDto> pesquisar(ContasReceberFilter contasReceberFilter, Pageable pageable){

return contasReceberRepository.filtrar(contasReceberFilter,pageable);
}

}
