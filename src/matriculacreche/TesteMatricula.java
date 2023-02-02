package matriculacreche;

import java.time.LocalDate;
import java.util.Arrays;

import matriculacreche.documentos.CarteiraDeVacinacao;
import matriculacreche.documentos.CertidaoDeNascimento;
import matriculacreche.documentos.HistoricoEscolar;
import matriculacreche.documentos.StatusHistoricoEscolar;
import matriculacreche.validacoes.ValidarDocumento;
import matriculacreche.validacoes.CarteiraDeVacinacaoValidacao;
import matriculacreche.validacoes.CertidaoDeNascimentoValidacao;
import matriculacreche.validacoes.HistoricoEscolarValidacao;

public class TesteMatricula {

	public static void main(String[] args) {
		Matricular matricular = new Matricular();
		
		CertidaoDeNascimento certidaoDeNascimento = new CertidaoDeNascimento(LocalDate.of(1998, 8, 17), "cartorio de itaquera");
		CarteiraDeVacinacao carteiraDeVacinacao = new CarteiraDeVacinacao(true, true);
		HistoricoEscolar historicoEscolar = new HistoricoEscolar(StatusHistoricoEscolar.NAO_INICIADO);
		
		ValidarDocumento validadorHistorico = new HistoricoEscolarValidacao();
		ValidarDocumento validadorCertidao = new CertidaoDeNascimentoValidacao();
		ValidarDocumento validadorVacinacao = new CarteiraDeVacinacaoValidacao();

		Crianca crianca = new Crianca("Joazinho", 14, "limoeiro", certidaoDeNascimento, carteiraDeVacinacao, historicoEscolar);
		
		if(matricular.matricular(crianca, Arrays.asList(validadorCertidao,validadorHistorico,validadorVacinacao)))
			System.out.println("Estudante matriculado!");
		else
			System.out.println("Não foi possível matricular o estudante");
	}
}
