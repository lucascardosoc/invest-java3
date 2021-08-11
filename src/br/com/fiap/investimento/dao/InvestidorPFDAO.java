package br.com.fiap.investimento.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.fiap.investimento.exceptions.DadoNaoAlteradoException;
import br.com.fiap.investimento.exceptions.DadoNaoRemovidoException;
import br.com.fiap.investimento.exceptions.DataBaseException;
import br.com.fiap.investimento.model.InvestidorPF;
import br.com.fiap.investimento.tools.DBTools;

public class InvestidorPFDAO implements GenericDAO<InvestidorPF, Integer> {

	
	public List<InvestidorPF> listarTodos() throws DataBaseException {
		
		// Obtendo o Driver - Oracle / Mysql / SQLServer
		// Abrindo a Conexao
		// Preparando o comando SQL
		// >>>> SELECT * FROM TB_INVESTIDOR
		// Executo o comando SQL
		// Obtendo o retorno do SQL
		// Integrando o retorno SQL com o Java
		List<InvestidorPF> investidores = new ArrayList<InvestidorPF>();
		investidores.add(new InvestidorPF("Felipe", 10));
		investidores.add(new InvestidorPF("Flávio", 11));
		investidores.add(new InvestidorPF("Marihá", 12));
		investidores.add(new InvestidorPF("Leonardo", 13));

		return investidores;

		// Fechando a conexao
	}

	
	
	@Override
	public InvestidorPF consultarPorId(Integer chave) throws DataBaseException {
		return null;
	}

	@Override
	public Integer cadastrar(InvestidorPF entidade) throws DataBaseException  {
		return null;
	}

	@Override
	public void alterar(InvestidorPF entidade) throws DataBaseException, DadoNaoAlteradoException {
		
	}

	@Override
	public void excluir(Integer chave) throws DataBaseException, DadoNaoRemovidoException {
		// Obtendo o Driver - Oracle / Mysql / SQLServer
		// Abrindo a Conexao
		// Preparando o comando SQL
		// >>>> DELETE FROM TB_INVESTIDOR WHERE ID_INVESTIDOR = chave
		// Executo o comando SQL
		// Obtendo o retorno do SQL
		// Retorno sucesso ou falha
		
		DBTools.obterConexao();
		
		if ( chave.intValue() == 0 || chave.intValue() == 100) {
			throw new DadoNaoRemovidoException();
		} 
		
		System.out.println("Investidor excluído com sucesso: " + chave);
	}
	
	
	
	
	
}
