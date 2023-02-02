package matriculacreche.validacoes;

import matriculacreche.Crianca;
import matriculacreche.documentos.StatusHistoricoEscolar;

public class HistoricoEscolarValidacao implements ValidarDocumento{

	@Override
	public boolean validar(Crianca crianca) {
		if(crianca.getHistoricoEscolar().getStatus() == StatusHistoricoEscolar.INCOMPLETO 
				|| crianca.getHistoricoEscolar().getStatus() == StatusHistoricoEscolar.NAO_INICIADO)
			return true;
		return false;
	}

}
