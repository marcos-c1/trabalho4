package br.com.prog3.trabalho4.service;

import java.util.List;

import br.com.prog3.trabalho4.domain.Dependente;
import br.com.prog3.trabalho4.repository.DependenteRepository;

public class DependenteService {
	public List <Dependente>listarTodos(){
		DependenteRepository depRepository = new DependenteRepository();
		return depRepository.listarTodos();
		}
}
