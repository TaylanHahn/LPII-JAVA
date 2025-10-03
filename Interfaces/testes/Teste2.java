package testes;

import interfaces.ICarro;
import satelite.SateliteBom;
import fiat.FiatSat;
import ford.FordSat;

public class Teste2 {

  public static void main(String[] args) {
    SateliteBom s;    
    ICarro c1;
    ICarro c2;

    s = Fabrica.getSatelite();
    c1 = Fabrica.getFordSat();
    c2 = Fabrica.getFiatSat();
    
    s.controlaCarro(c1);
    
    s.controlaCarro(c2);    
  }//main()
  
}//Teste2.

class Fabrica{
	  
	  public static SateliteBom getSatelite(){
		  return new SateliteBom();
	  }
	  
	  public static ICarro getFordSat(){
		  return new FordSat();
	  }
	  
	  public static ICarro getFiatSat(){
		  return new FiatSat();
	  }

}//Fabrica.

