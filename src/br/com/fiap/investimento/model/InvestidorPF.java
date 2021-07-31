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

	
	@Override
	public boolean equals(Object obj) {
		boolean retorno = true;
		
		if ( obj instanceof InvestidorPF ) {
			InvestidorPF investidorComparacao = (InvestidorPF) obj;
			
			if ( ! this.getNome().equals(investidorComparacao.getNome()) ) {
				retorno = false;
			}
			
			if ( this.getPatrimonio() != investidorComparacao.getPatrimonio() ) {
				retorno = false;
			}
			
			
		} else {
			retorno = false;
		}
			
		return retorno;
	}
	
	
	
	
	
}
