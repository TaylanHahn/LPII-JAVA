package wrappers;

public class TestaInteger {
  public static void main(String[] args) {
    int     i;
    String  s;
    Integer objInteger;

    i = 31;
    
    System.out.println("i = " + i);
    System.out.println("MIN_VALUE: " + Integer.MIN_VALUE);
    System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);
    System.out.println("SIZE:      " + Integer.SIZE);
    System.out.println("bitCount(i):       " + Integer.bitCount(i));
    System.out.println("highestOneBit(i):  " + Integer.highestOneBit(i));
    System.out.println("lowestOneBit(i):   " + Integer.lowestOneBit(i));
    System.out.println("toBinaryString(i): " + Integer.toBinaryString(i));
    System.out.println("toHexString(i):    " + Integer.toHexString(i));

    //Instanciando um Integer.
    objInteger = new Integer(1);
    System.out.println(objInteger);
    
    //int para Integer.
    objInteger = Integer.valueOf(2);
    System.out.println(objInteger);
    //ou automaticamente: auto-boxing, encaixotamento
    objInteger = 3;
    System.out.println(objInteger);
    i=4;
    objInteger = i; 
    System.out.println(objInteger);

    //Integer para int.
    i = objInteger.intValue();
    //ou automaticamente: auto-unboxing, desencaixotamento 
    i = objInteger;
    System.out.println(i);
    
    //String para Integer.
    objInteger = Integer.parseInt("5");
    System.out.println(objInteger);
    
    //int para String.
    s = Integer.toString(6);
    System.out.println(s);
    
    int a, b;
    a = 2;
    b = a + objInteger;
    System.out.println(b);

  }//main()

}//TestaInteger