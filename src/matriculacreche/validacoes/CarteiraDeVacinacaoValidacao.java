package matriculacreche.validacoes;

import matriculacreche.Crianca;

public class CarteiraDeVacinacaoValidacao implements ValidarDocumento{

	@Override
	public boolean validar(Crianca crianca) {
		if(crianca.getCarteiraDeVacinacao().isBcg() && crianca.getCarteiraDeVacinacao().isVacinaCovid())
			return true;
		return false;
	}

}
