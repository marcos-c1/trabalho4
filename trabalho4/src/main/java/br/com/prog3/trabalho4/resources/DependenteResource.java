package br.com.prog3.trabalho4.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prog3.trabalho4.domain.Dependente;
import br.com.prog3.trabalho4.service.DependenteService;

@RestController
@RequestMapping("api/v1/dependentes")
public class DependenteResource {
	@GetMapping()
	public List <Dependente> get(){
		DependenteService depService = new DependenteService();
		return depService.listarTodos();
		}
}
