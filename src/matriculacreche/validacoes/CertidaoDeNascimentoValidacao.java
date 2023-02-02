package matriculacreche.validacoes;

import matriculacreche.Crianca;

//RG
public class CertidaoDeNascimentoValidacao implements ValidarDocumento{

	@Override
	public boolean validar(Crianca crianca) {
		if (crianca.getCertidaoDeNascimento()!=null) 
			return true;
		return false;
	}

}
