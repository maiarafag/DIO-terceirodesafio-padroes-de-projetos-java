package dio3.gof.strategy;

public class Aggressive implements Comportament {

	@Override
	public void mover() {
		System.out.println("Se move agressivamente! ");
	}

}
