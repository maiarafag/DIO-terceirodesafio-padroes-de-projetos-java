package dio3.gof;

//lazy holder

public class SingletonLentoHolder {
	
	private static class InstanceHolder {
		private static SingletonLentoHolder instancia = new SingletonLentoHolder();
	}
   
	private SingletonLentoHolder() {
		super();
	}
	
	public static SingletonLentoHolder getInstancia() {
		return InstanceHolder.instancia;
	}

}
