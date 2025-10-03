package formatacao;
import java.text.NumberFormat;
import java.text.ParseException;

public class TestaNumberFormatCurrency {

  public static void main(String[] args) {
    double r;
    NumberFormat nf;
    String s;
	  
    Number nn;
    
    //usa o caracter do sistema do usuário como separador (ponto, virgula, etc...).	  
    nf = NumberFormat.getCurrencyInstance();
    
    r = 1234567.123d;

    System.out.println("nf = NumberFormat.getCurrencyInstance();");
    System.out.println("nf.format(r) = " + nf.format(r));    
    System.out.println();
    
    s = "R$ 1.234,98";   //ok
    //s = "R$ 1234,98";   //ok
    //s = "R$  1234,98";  //erro (dois espaços)
    //s = "R$1.234,98";   //erro
    //s = "R$  1.234,98"; //erro
    try {
      //Transforma de String para double.      
      r = nf.parse(s).doubleValue();
      System.out.println(r);
    }
    catch (ParseException e){
      System.out.println(e.getMessage());
    }    
  }//main
}//TestaNumberFormatCurrency.