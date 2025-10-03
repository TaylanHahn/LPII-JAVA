package formatacao;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class TestaNumberFormat {

  public static void main(String[] args) throws ParseException {
    double r;
    NumberFormat nf;
    String s;
    
    //Esta classe n�o pode ser instanciada pois � uma classe abstrata.
    //nf = new NumberFormat();

    //Deve se chamar o m�todo de classe getInstance() para se obter uma inst�ncia da classe.
    //Usa as informa��es do Local do sistema.
    //Usa o caracter do sistema do usu�rio como separador (ponto, virgula, etc...)
    nf = NumberFormat.getInstance();
    //nf = NumberFormat.getCurrencyInstance();
    //nf = NumberFormat.getIntegerInstance();
    //nf = NumberFormat.getPercentInstance();
    
    //Usa as informa��es de Locais espec�ficos.
    //nf = NumberFormat.getInstance(Locale.FRANCE);
    //nf = NumberFormat.getInstance(Locale.ENGLISH);
    //nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    //nf = NumberFormat.getCurrencyInstance(Locale.US);
    //nf = NumberFormat.getIntegerInstance(Locale.US);
    //nf = NumberFormat.getPercentInstance(Locale.US);
    
    r = 1234567.786669d;
    //r = 1234567.789d;
    //r = 1234567.789d;
    //r = 0.789f;
    
    System.out.println("nf.format(r) = " + nf.format(r));    
    //System.out.println(NumberFormat.getInstance().format(r));
    System.out.println();
    
    s = "1.235.678,987654321";
    //s = "R$ 1.235.678,987654321";
    //s = "1.235.678";
    //s = "52,35%";

    //Transforma de String para double.
    //Number myNumber = nf.parse(s);
    //r = myNumber.doubleValue();
    r = nf.parse(s).doubleValue();
    System.out.println(r);
    //System.out.println(NumberFormat.getInstance().parse(s).doubleValue());

  }//main
}//TestaNumberFormat.