package dio3.gof;

//preguiçoso

public class SingletonLento {
    
	private static SingletonLento instancia;
	
	private SingletonLento() {
		super();
	}
	
	public static SingletonLento getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLento();
		}
		return instancia;
	}

}
