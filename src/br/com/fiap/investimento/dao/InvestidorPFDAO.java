package br.com.fiap.investimento.dao;

import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorPFDAO {

	//entrada OK >> processamento OK >> saída OK
	
	// cadastrar - INSERT
	public boolean cadastrar( InvestidorPF investidor ) {
		// processamento - Comando SQL
		return true;
	}
	
	
	// alterar - UPDATE
	
	// excluir - DELETE
	
	
	
	// consultar - SELECT BY ID 
	public InvestidorPF consultarPorId(int id) {
		// processamento
		return new InvestidorPF();
	}
	
	public InvestidorPF consultarPorCpf(String cpf) {
		// processamento
		return new InvestidorPF();
	}
	
	
	// listarTodos - SELECT ALL
	public InvestidorPF[] listarTodos() {
		// Simulador do Banco de Dados
		InvestidorPF investores[] = new InvestidorPF[2];
		investores[0] = new InvestidorPF("Flávio", 1);
		investores[1] = new InvestidorPF("Felipe", 15000000);
		// ****************************************
		
		return investores;
	}
	
}
