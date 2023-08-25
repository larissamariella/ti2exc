package com.ti2cc;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		ClassX X = new ClassX("pablo", 10,150);
		if(dao.inserirX(X) == true) {
			System.out.println("Inserção com sucesso -> " + X.toString());
		}

		//Mostrar usuários do sexo masculino		
		System.out.println("==== Mostrar usuários do sexo masculino === ");
		ClassX[] dados = dao.getXMaior();
		for(int i = 0; i < dados.length; i++) {
			System.out.println(dados[i].toString());
		}

		//Atualizar usuário
		X.setIdade(10);
		dao.atualizarX(X);

		//Mostrar usuários do sexo masculino
		System.out.println("==== Mostrar usuários === ");
		dados = dao.getXMaior();
		for(int i = 0; i < dados.length; i++) {
			System.out.println(dados[i].toString());
		}

		//Excluir usuário
		dao.excluirX(X.getNome());
		
		//Mostrar usuários
		dados = dao.getX();
		System.out.println("==== Mostrar usuários === ");		
		for(int i = 0; i < dados.length; i++) {
			System.out.println(dados[i].toString());
		}
		
		dao.close();
	}
}