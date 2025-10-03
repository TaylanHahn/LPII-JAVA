
import java.util.Date;

public class TestaDate3 {

  public static void main(String[] args) {
    Date d;
    int dia, mes, ano;

    //Pega a data/hora atual.
    d = new Date();

    dia = d.getDate();
    mes = d.getMonth() + 1;
    ano = d.getYear()  + 1900;

    System.out.println("dia : " + dia);
    System.out.println("mes : " + mes);
    System.out.println("ano : " + ano);
  }//main
}//TestaDate3.