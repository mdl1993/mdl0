package folder.controllers.forms;

import folder.domain.*;

public class AnagraficaForm {

	private Anagrafica anagrafica;

	public AnagraficaForm() {
		super();
	}

	public AnagraficaForm(Anagrafica anagrafica) {
		super();
		this.anagrafica = anagrafica;
	}

	public Anagrafica getAnagrafica() {
		return anagrafica;
	}

	public void setAnagrafica(Anagrafica anagrafica) {
		this.anagrafica = anagrafica;
	}
}