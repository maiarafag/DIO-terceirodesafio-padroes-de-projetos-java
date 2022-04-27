package dio3.gof;

import dio3.gof.facade.Facade;
import dio3.gof.strategy.Aggressive;
import dio3.gof.strategy.Comportament;
import dio3.gof.strategy.Defensive;
import dio3.gof.strategy.Normal;
import dio3.gof.strategy.Robo;

//Testes

public class Test {

	public static void main(String[] args) {
		//Singleton
		SingletonLento lento = SingletonLento.getInstancia();
        System.out.println(lento);
        lento = SingletonLento.getInstancia();
        System.out.println(lento);
        
        SingletonRapido rapido = SingletonRapido.getInstancia();
        System.out.println(rapido);
        rapido = SingletonRapido.getInstancia();
        System.out.println(rapido);
        
        SingletonLentoHolder holder = SingletonLentoHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLentoHolder.getInstancia();
        System.out.println(holder);
        
        //Strategy
        
      Comportament normal = new Normal();
      Comportament defensivo = new Defensive();
      Comportament agressivo = new Aggressive();
        
      Robo robo = new Robo();
      robo.setComportamento(normal);
      robo.mover();
      robo.setComportamento(defensivo);
      robo.mover();
      robo.mover();
      robo.setComportamento(agressivo);
      robo.mover();
      robo.mover();
      robo.mover();
      
      //Facade
      
      Facade facade = new Facade();
      facade.migrarCliente("Maiara", "39400000");
                              
	}

}
