package br.com.prog3.trabalho4.domain;

public class Dependente {

	private Empregado empregado;
	
	private String nome;
	
	private String grauParentesco;
	
	private String dataNascimento;


	

	public Dependente(Empregado empregado, String nome, String grauParentesco, String dataNascimento) {
		super();
		this.empregado = empregado;
		this.nome = nome;
		this.grauParentesco = grauParentesco;
		this.dataNascimento = dataNascimento;
	}

	public Empregado getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
