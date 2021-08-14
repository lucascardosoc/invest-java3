package br.com.fiap.investimento.exceptions;

public class AplicacaoException extends Exception {

	public AplicacaoException() {
	}

	public AplicacaoException(String message) {
		super(message);
	}

	public AplicacaoException(Throwable cause) {
		super(cause);
	}

	public AplicacaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public AplicacaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
