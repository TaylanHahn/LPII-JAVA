
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestaSimpleDateFormat {

  public static void main(String[] args) {
    
    String s, s_aux;
    Date d;
    SimpleDateFormat sdf;    

    //Cria o formatador de Data e Hora.
    sdf = new SimpleDateFormat("dd/MM/yyyy");
    sdf.setLenient(true);

    //Pega a data/hora atual.
    d = new Date();

    //Transforma Date para String.
    s = sdf.format(d);
    System.out.println("sdf.format(d): " + s);

    System.out.println();	  

    //Transforma String para Date.
    
    
    try { //tenta
      System.out.println("Digite uma data (dd/mm/yyyy): ");
      //s_aux = t.leString();
      s_aux = "27/03/2008";      
      d = sdf.parse(s_aux); //poder� lan�ar uma exe��o (Erro) do tipo ParseException.
      //Essa exce��o somos obrigados a tratar.
      System.out.println("sdf.format(d): " + sdf.format(d));
    }
    //se der erro 
    catch (ParseException e)  {//captura o erro ParseException e coloca na variavel e.
      System.out.println("Erro. Data inv�lida: " + e.getMessage());
    }
    
  }//main
}//TestaSimpleDateFormat.