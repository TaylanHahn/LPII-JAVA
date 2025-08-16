/*
  Exemplo para demonstração das representações literais no Java.
*/
public class Literais {
  public static void main(String[] args) {
    //Literais int (em octal, decimal e hexadecimal):
    int i1 =  014; //14 em octal       = 12 em decimal.
    int i2 =   14; //14 em decimal     = 14 em decimal.
    int i3 = 0x14; //14 em hexadecimal = 20 em decimal.
    System.out.println("----- Literais int -----");    
    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);
    System.out.println();
        
    //Literais long:         
    long l1 = 12345678901L; //Tem que especificar L.
    //i1 =    12345678901L; //long não pode ser atribuído para int.
    //l1 =    12345678901;  //12345678901 eh um long. Tem que especificar L.
    System.out.println("----- Literal long -----");    
    System.out.println(l1);
    System.out.println();
    
    //Literais float (até 7 dígitos significativos):
    float f1 = 123.45678912f;
    float f2 = 123.45678912F;
    float f3 = 1.2345678912e2f;
    float f4 = 1.2345678912e2F;
    //Permite armazenar valores muito altos ou muito baixos, 
    //mas com precisão de apenas 7 dígitos.
    //123 trilhoes 456 bilhões 789 milhoes 234 mil 567.
    float f5 = 123456789234567f; 
    float f6 = 0.000000000000123456789234567f;
    float f7 = 0.100000000000123456789234567f;

    System.out.println("----- Literais float -----");
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    System.out.println(f4);
    System.out.println(f5);
    System.out.printf("%15.1f\n", f5);
    System.out.println(f6);
    System.out.printf("%2.30f\n", f6);
    System.out.println(f7);
    System.out.printf("%2.30f\n", f7);    
    System.out.println();
    
    //Se não especificar f ou F, então é um valor double.
    //Erro de compilação: se não colocar f é um valor double.
    //f1 = 123.45; 
        
    //Literais double (17 digitos significativos):
    double d1 = 123.4567890123456789012;
    double d2 = 123.4567890123456789012d; 
    double d3 = 123.4567890123456789012D; 
    double d4 = 1.234567890123456789012e2d; 
    double d5 = 1.234567890123456789012e2D;
    double d6 = 1.234567890123456789012e2; 
    
    System.out.println("----- Literais double -----");    
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
    System.out.println(d4);
    System.out.println(d5);
    System.out.println(d6);
    System.out.println();
          
    //Literais char:
    char c1 = 'a';      //letra a
    char c2 = '\u0064'; //letra d
    System.out.println("----- Literais char -----");    
    System.out.println(c1);
    System.out.println(c2);
    System.out.println();    
    
    //Literal String:
    String s = "teste";
    System.out.println("----- Literal String -----");    
    System.out.println(s);
    System.out.println("Testando o char \u0064 dentro de uma String.");
  }//main()
}//Literais