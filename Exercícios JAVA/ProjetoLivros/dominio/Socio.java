package dominio;

public class Socio extends Cliente{

  public Socio(String nome) {
    super(nome);
  }

  public float desconto() {
    float total = 0;

    total = 0.5f * getLivros().size();

    //ou
    /*
    for (Livro livro : getLivros()) {
        total += 0.5f;;
    }
     */

    //ou
    /*
    List<Livro> livros;
    livros = getLivros();
    for (Livro livro : livros) {
      total += 0.5f;;
    }
     */

    return total;

  }//taxa()

}//Socio.