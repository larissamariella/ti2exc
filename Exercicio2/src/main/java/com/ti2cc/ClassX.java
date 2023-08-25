package com.ti2cc;
public class ClassX {
	private String nome ;
	private int idade;
	private int altura;
	
	public ClassX() {
		this.nome  = "teste";
		this.idade = 0;
		this.altura = 1;
	}
	
	public ClassX(String nome , int idade, int altura) {
		this.nome  = nome ;
		this.idade = idade;
		this.altura = altura;
	}


	public String getNome () {
		return nome ;
	}

	public void setNome (String nome ) {
		this.nome  = nome ;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "X [nome =" + nome  + ", idade =" + idade + ", altura=" + altura + "]";
	}	
}
