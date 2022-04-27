package dio3.gof;

//apressado

public class SingletonRapido {
    
	private static SingletonRapido instancia = new SingletonRapido();
	
	private SingletonRapido() {
		super();
	}
	
	public static SingletonRapido getInstancia() {
		return instancia;
	}

}
