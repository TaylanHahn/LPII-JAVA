import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestaLocalDate6_parse {

  public static void main(String[] args) {
    LocalDate d;
    LocalDateTime dt;
    String s;

    //Cria um objeto com data/hora 30 de dezembro de 2021, 15h55.
    dt = LocalDateTime.of(2021, 12, 30, 15, 55);
    System.out.println("dt= " + dt);

    DateTimeFormatter dtf;

    dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    s = dt.format(dtf);
    System.out.println("ofPattern(dd/MM/yyyy)= " + s);

    d = LocalDate.parse(s, dtf);
    System.out.println("LocalDate.parse(...)= " + d);

    d = LocalDate.parse("2022-12-30");
    System.out.println("LocalDate.parse(...)= " + d);
  }

}//TestaLocalDate3_parse