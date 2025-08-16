/*
  Exemplo para demonstrar os tipos float e double bem como 
  suas representações literais.
*/
public class Reais {
  public static void main(String[] args) {
        
    //Formas de escrever um literal float:
    float f1 = 123.4f;
    float f2 = 123.4F;
    float f3 = 1.234e2f;
    float f4 = 1.234e2F;
    
    //Float tem apenas 7 dígitos significativos:
    float f5 = 1.234567f; //7 digitos significativos.
    float f6 = 1.2345670f;
    float f7 = 1.2345671f;
    float f8 = 1.2345678f;
       
    //Se não especificar f, então é um valor double.
    //f1 = 1.23; //erro de compilação, pois é um valor double.
        
    //Formas de escrever um literal double:
    double d1 = 1.2345678901234567; //17 digitos significativos
    double d2 = 1.2345678901234567d; 
    double d3 = 1.2345678901234567D; 
    double d4 = 1.2345678901234567e0d; 
    double d5 = 1.2345678901234567e0D;
    double d6 = 1.2345678901234567e0; 
        
    double d7 = 1.23456789012345671d;
    double d8 = 1.23456789012345675d;
    double d9 = 1.23456789012345678d;

    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    System.out.println(f4);
    System.out.println(f5);
    System.out.println(f6);
    System.out.println(f7);
    System.out.println(f8);

    System.out.println();
    
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
    System.out.println(d4);
    System.out.println(d5);
    System.out.println(d6);
    System.out.println(d7);
    System.out.println(d8);
    System.out.println(d9);
  }//main()
  
}//Reais.