package matriculacreche;

import java.util.List;

import matriculacreche.validacoes.ValidarDocumento;

public class Matricular {

	public boolean matricular(Crianca crianca, List<ValidarDocumento> documentos) {
		for (ValidarDocumento validarDocumento : documentos) {
			if(!validarDocumento.validar(crianca))
				return false;
		}
		return true;
	}
}
