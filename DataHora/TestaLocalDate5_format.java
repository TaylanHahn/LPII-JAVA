import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TestaLocalDate5_format {

  public static void main(String[] args) {
    LocalDateTime dt;
    String s;

    //Cria um objeto com data/hora 30 de dezembro de 2021, 15h55.
    dt = LocalDateTime.of(2021, 12, 30, 15, 55);
    System.out.println("dt= " + dt);

    DateTimeFormatter dtf;

    dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
    s = dt.format(dtf);
    System.out.println("FormatSylte.FULL= " + s);

    dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
    s = dt.format(dtf);
    System.out.println("FormatSylte.LONG= " + s); 

    dtf = DateTimeFormatter.ISO_DATE;
    s = dt.format(dtf);
    System.out.println("DateTimeFormatter.ISO_DATE= " + s);

    dtf = DateTimeFormatter.ISO_DATE_TIME;
    s = dt.format(dtf);
    System.out.println("DateTimeFormatter.ISO_DATE_TIME= " + s);

    dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    s = dt.format(dtf);
    System.out.println("ofPattern(dd/MM/yyyy)= " + s);

  }

}//TestaLocalDate2_format