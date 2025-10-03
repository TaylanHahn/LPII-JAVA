package wrappers;

public class TestaFloat {
  public static void main(String[] args) {
    
    System.out.println("MIN_VALUE: " + Float.MIN_VALUE);
    System.out.println("MAX_VALUE: " + Float.MAX_VALUE);
    System.out.println("SIZE:      " + Float.SIZE);

    float f1, f2;
    String  s;
    Float objFloat;
    
    //Instanciando um Float.
    objFloat = new Float(9.5f);
    System.out.println(objFloat);

    objFloat = Float.valueOf(5);
    System.out.println(objFloat);
    
    //String para Float.
    objFloat = Float.parseFloat("9.5");
    System.out.println(objFloat);
    
    //float para String.
    s = Float.toString(9.5f);
    System.out.println(s);
    
    //float para Float.
    objFloat = Float.valueOf(9.5f);
    //ou automaticamente: auto-boxing, encaixotamento
    objFloat = 9.5f;
    System.out.println(objFloat);
    
    //Float para float.
    f1 = objFloat.floatValue();
    //ou automaticamente: auto-unboxing, desencaixotamento 
    f1 = objFloat;
    System.out.println(f1);

    f2 = f1 / 0;
    System.out.println("f1 / 0      = " + f2);
    System.out.println("isInfinite()= " + Float.isInfinite(f2));
    
    f2 = 0.0f / 0.0f;
    System.out.println("0.0 / 0.0   = " + f2);
    System.out.println("isNaN()     = " + Float.isNaN(f2));
  }//main()

}//TestaInteger