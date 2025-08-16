/* Exemplo para demonstração do operador instanceof.
 */
public class Instanceof {
 public static void main(String args[]) {
  Pai obj1 = new Pai();
  Pai obj2 = new Filho();
  System.out.println("obj1 instanceof Pai:            " + (obj1 instanceof Pai)); //true
  System.out.println("obj1 instanceof Filho:          " + (obj1 instanceof Filho)); //false
  System.out.println("obj1 instanceof MinhaInterface: " + (obj1 instanceof MinhaInterface));//false
  System.out.println("obj2 instanceof Pai:            " + (obj2 instanceof Pai)); //true
  System.out.println("obj2 instanceof Filho:          " + (obj2 instanceof Filho)); //true
  System.out.println("obj2 instanceof MinhaInterface: " + (obj2 instanceof MinhaInterface));//true
 }//main()
}//Instanceof.

interface MinhaInterface {
}

class Pai {
}

class Filho extends Pai implements MinhaInterface {
}
