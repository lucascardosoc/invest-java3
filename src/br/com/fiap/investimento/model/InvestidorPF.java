package br.com.fiap.investimento.model;

public class InvestidorPF extends Investidor {

	private String cpf;

	public InvestidorPF() {
		super();
	}

	public InvestidorPF(String paramCpf, String paramNome, double paramPatrimonio) {
		cpf = paramCpf;
		super.setNome(paramNome);
		super.setPatrimonio(paramPatrimonio);
	}
	
	
	public InvestidorPF(int investidorId, String nome, double patrimonio) {
		super(investidorId, nome, patrimonio);
	}

	public InvestidorPF(String nome, double patrimonio) {
		super(nome, patrimonio);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "InvestidorPF [getCpf()=" + getCpf() + ", getInvestidorId()=" + getInvestidorId() + ", getNome()="
				+ getNome() + ", getPatrimonio()=" + getPatrimonio() + ", getPerfilRisco()=" + getPerfilRisco()
				+ ", getDataAberturaConta()=" + getDataAberturaConta() + "]";
	}

	

	
	
	
	
	
}
