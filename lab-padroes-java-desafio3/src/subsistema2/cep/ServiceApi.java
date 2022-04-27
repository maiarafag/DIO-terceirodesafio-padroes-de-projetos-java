package subsistema2.cep;

import dio3.gof.SingletonRapido;

public class ServiceApi {
	
private static ServiceApi instancia = new ServiceApi();
	
	private ServiceApi() {
		super();
	}
	
	public static ServiceApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Montes Claros";
	}
	public String recuperarEstado(String cep) {
		return "Minas Gerais";
	}

}
