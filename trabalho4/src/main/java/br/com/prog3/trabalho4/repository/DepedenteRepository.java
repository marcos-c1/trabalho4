package br.com.prog3.trabalho4.repository;

import java.util.List;

import br.com.prog3.trabalho4.domain.Dependente;
import br.com.prog3.trabalho4.domain.Empregado;

public interface DepedenteRepository {
	public void inserir(Dependente dep);
	public void alterar(Dependente dep);
	public void excluir(Dependente dep);
	public List<Dependente> listarTodos();
	public Dependente buscarPeloNome(String nome);
	public List<Dependente> buscarPeloEmpregado(Empregado emp);
}
