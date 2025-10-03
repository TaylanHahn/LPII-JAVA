
import java.util.Date;

public class TestaDate1 {

  public static void main(String[] args) {
    Date d1, d2;
    int dia, mes, ano, h, m, s, dia_semana;
    long time;

    //Pega a data/hora atual.
    d1 = new Date();

    dia = d1.getDate();
    mes = d1.getMonth() + 1;
    ano = d1.getYear()  + 1900;
    h   = d1.getHours();
    m   = d1.getMinutes();
    s   = d1.getSeconds();
    dia_semana = d1.getDay(); //0 = domingo

    time = d1.getTime();

    System.out.println("dia : " + dia);
    System.out.println("mes : " + mes);
    System.out.println("ano : " + ano);
    System.out.println("hora: " + h);
    System.out.println("min : " + m);
    System.out.println("seg : " + s);
    System.out.println("time: " + time);
    System.out.println("dia da semana : " + dia_semana + " (0=domingo, 1=segunda, ...) ");
    System.out.println();

    d2 = new Date(time);
    //d2 = new Date();
    //d2.setTime(time);
    System.out.println(d2.toGMTString());
    System.out.println(d2.toLocaleString());
    System.out.println(d2);

    d2.setTime(0);
    System.out.println(d2.toGMTString());
    
    d2.setTime(10000);
    System.out.println(d2.toGMTString());
    
    d2.setTime(-10000);
    System.out.println(d2.toGMTString());

  }//main

}//TestaDate1.