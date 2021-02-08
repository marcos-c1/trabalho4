package br.com.prog3.trabalho4.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.prog3.trabalho4.domain.Dependente;
import br.com.prog3.trabalho4.domain.Empregado;
import br.com.prog3.trabalho4.enums.Modalidade;

public class DependenteRepository implements DepedenteRepository {

	@Override
	public void inserir(Dependente dep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Dependente dep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Dependente dep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Dependente> listarTodos() {
		List<Dependente>dep = new ArrayList<>();
		Empregado emp = new Empregado();
		emp.setNome("Marcos");
		dep.add(new Dependente(emp,"Rodrigo","Filho","20/01/2000"));
		dep.add(new Dependente(emp,"Josevaldo","Filho","10/01/1990"));
		dep.add(new Dependente(emp,"Maria","Mãe","05/03/1965"));
		dep.add(new Dependente(emp,"Joselma", "Filha", "02/01/2005"));
		dep.add(new Dependente(emp,"Ricardo", "Pai", "05/09/1960"));
		return dep;
	}

	@Override
	public Dependente buscarPeloNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dependente> buscarPeloEmpregado(Empregado emp) {
		// TODO Auto-generated method stub
		return null;
	}

}
