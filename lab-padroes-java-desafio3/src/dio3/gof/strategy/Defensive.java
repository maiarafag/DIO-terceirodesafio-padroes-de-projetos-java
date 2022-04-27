package dio3.gof.strategy;

public class Defensive implements Comportament {

	@Override
	public void mover() {
		System.out.println("Se move defensivamente! ");
	}

}
