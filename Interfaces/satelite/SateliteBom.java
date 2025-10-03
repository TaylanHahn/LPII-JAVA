package satelite;

import interfaces.ICarro;

public class SateliteBom {
  
  public void controlaCarro(ICarro c) {
    System.out.println("Sat�lite iniciando controle do carro.");
    System.out.println(c.marca());
    System.out.println("iniciando acelera��o");
    System.out.println("acelera");
    c.acelera();
    System.out.println("acelera");    
    c.acelera();
    System.out.println("acelera");    
    c.acelera();
    System.out.println("Iniciando desacelera��o");
    System.out.println("freia");
    c.freia();
    System.out.println("freia");
    c.freia();
    System.out.println("freia");
    c.freia();
    System.out.println("Sat�lite liberando controle do carro.\n");
  }
  
}//SateliteBom.
