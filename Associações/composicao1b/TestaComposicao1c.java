package composicao1b;

public class TestaComposicao1c {

  public static void main(String[] args) {
    Residencia r1, r2;
    
    r1 = new Residencia("abc", 100);
    r2 = (Residencia)r1.clone();
    System.out.println(r2);

  }//main()

}//TestaComposicao1c
