package matriculacreche.documentos;

public class CarteiraDeVacinacao {

	private boolean vacinaCovid;
	private boolean bcg;

	public CarteiraDeVacinacao(boolean vacinaCovid, boolean bcg) {
		super();
		this.vacinaCovid = vacinaCovid;
		this.bcg = bcg;
	}

	public boolean isVacinaCovid() {
		return vacinaCovid;
	}

	public boolean isBcg() {
		return bcg;
	}

}
