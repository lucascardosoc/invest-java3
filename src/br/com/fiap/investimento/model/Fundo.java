package br.com.fiap.investimento.model;

public class Fundo {

	private int fundoId;
	private String nomeFundo;
	
	public int getFundoId() {
		return fundoId;
	}
	public void setFundoId(int fundoId) {
		this.fundoId = fundoId;
	}
	public String getNomeFundo() {
		return nomeFundo;
	}
	public void setNomeFundo(String nomeFundo) {
		this.nomeFundo = nomeFundo;
	}
	
	@Override
	public String toString() {
		String retorno = super.toString();
		return "Fundo [fundoId=" + fundoId + ", nomeFundo=" + nomeFundo + "] " + retorno;
	}
	
	
	
	
	
}
