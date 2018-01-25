package org.iniciante;

public class Pessoa {
	//iniciante
	private String nome;
	private int maxLivros;

	public Pessoa(){
		nome = "Nome desconhecido";
		maxLivros = 3;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome_pessoa) {
		nome = nome_pessoa;
	}

	public int getMaxLivros() {
		return maxLivros;
	}

	public void setMaxLivros(int maxLivros) {
		this.maxLivros = maxLivros;
	}
}
