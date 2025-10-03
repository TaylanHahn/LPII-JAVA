
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;

public class TestaDateFormat {

  public static void main(String[] args) {
    String s, s_aux;
    Date d;        //Objeto que armazena Data e Hora.
    DateFormat df; //Objeto para formatar Data e Hora.

    //Pega a data/hora atual.
    d = new Date();
    //Cria um objeto DateFormat com o formato utilizado pelo sistema.
    df = DateFormat.getDateInstance();

    //Transforma Date para String.
    s = df.format(d);
    System.out.println("df.format(d1) : " + s);
    //System.out.println("df.format(d1) : " + DateFormat.getDateInstance().format(d));

    System.out.println();	  

    //Transforma String para Date.
    try {
      s_aux = "27/03/2008";
      d = df.parse(s_aux);
      System.out.println("d = " + d);
      //System.out.println("d = " + DateFormat.getDateInstance().parse(s_aux));
    }
    catch (ParseException e) {
      System.out.println(e.getMessage());
    }
  }//main()
  
}//TestaDateFormat.