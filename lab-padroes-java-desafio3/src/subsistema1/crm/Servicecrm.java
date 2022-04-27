package subsistema1.crm;

public class Servicecrm {
	
	
	private Servicecrm() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String estado, String cidade) {
		System.out.println("Cliente salvo no sistema CRM.");
		System.out.println(nome);
		System.out.println(cidade);
		System.out.println(estado);
	}

	
		


}
