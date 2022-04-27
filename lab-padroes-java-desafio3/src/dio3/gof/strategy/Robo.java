package dio3.gof.strategy;

public class Robo {

	private Comportament comportamento;

	public void setComportamento(Comportament comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
	
	
}
