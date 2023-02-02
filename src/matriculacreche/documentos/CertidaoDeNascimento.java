package matriculacreche.documentos;

import java.time.LocalDate;

public class CertidaoDeNascimento {

	private LocalDate dataDeNascimento;
	private String cartorio;

	public CertidaoDeNascimento(LocalDate dataDeNascimento, String cartorio) {
		super();
		this.dataDeNascimento = dataDeNascimento;
		this.cartorio = cartorio;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public String getCartorio() {
		return cartorio;
	}

}
