package br.com.prog3.trabalho4.enums;

public enum Modalidade {
	A_DISTANCIA("A distância"),
	PRESENCIAL("Presencial"),
	SEMI_PRESENCIAL("Semi presencial");
	
	private String descricao;
	
	Modalidade(String descricao){
		this.descricao = descricao;
		}
	public String getDescricao(){
		return descricao;
		}
}
