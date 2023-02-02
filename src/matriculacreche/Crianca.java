package matriculacreche;

import matriculacreche.documentos.CarteiraDeVacinacao;
import matriculacreche.documentos.CertidaoDeNascimento;
import matriculacreche.documentos.HistoricoEscolar;

public class Crianca {

	private String nome;
	private int numero;
	private String logradouro;
	private CertidaoDeNascimento certidaoDeNascimento;
	private CarteiraDeVacinacao carteiraDeVacinacao;
	private HistoricoEscolar historicoEscolar;

	public Crianca(String nome, int numero, String logradouro, CertidaoDeNascimento dataDeNascimento,
			CarteiraDeVacinacao carteiraDeVacinacao, HistoricoEscolar historicoEscolar) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.logradouro = logradouro;
		this.certidaoDeNascimento = dataDeNascimento;
		this.carteiraDeVacinacao = carteiraDeVacinacao;
		this.historicoEscolar = historicoEscolar;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public CertidaoDeNascimento getCertidaoDeNascimento() {
		return certidaoDeNascimento;
	}

	public CarteiraDeVacinacao getCarteiraDeVacinacao() {
		return carteiraDeVacinacao;
	}

	public HistoricoEscolar getHistoricoEscolar() {
		return historicoEscolar;
	}

}
