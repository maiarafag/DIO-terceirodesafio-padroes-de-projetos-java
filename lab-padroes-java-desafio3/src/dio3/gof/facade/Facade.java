package dio3.gof.facade;

import subsistema1.crm.Servicecrm;
import subsistema2.cep.ServiceApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = ServiceApi.getInstancia().recuperarCidade(cep);
		String estado = ServiceApi.getInstancia().recuperarEstado(cep); 
	
	Servicecrm.gravarCliente(nome, cep, estado, cidade);

	}
	
}
