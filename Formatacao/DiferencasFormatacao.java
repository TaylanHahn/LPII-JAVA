package formatacao;
import java.text.NumberFormat;

public class DiferencasFormatacao {

  public static void main(String[] args) {
    double r;
    r = 1234567.123d;

    System.out.println("printl = " + r);         //Utiliza o ponto como separador de decimais.
    System.out.printf ("printf = %15.4f \n", r); //Utiliza o separador de decimais do sistema.

    String s1 = String.format("%15.4f", r);      //Utiliza o separador de decimais do sistema.
  
    //Utiliza separador de milhar e decimal do sistema.
    NumberFormat nf = NumberFormat.getInstance();
    String s2 = nf.format(r);

    System.out.println("String.format() = " + s1);
    System.out.println("NumberFormat.getInstance().format(r) = " + s2);
  }//main
	
}//DiferencasFormatacao.