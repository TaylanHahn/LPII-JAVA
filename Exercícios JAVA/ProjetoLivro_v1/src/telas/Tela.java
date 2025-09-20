package telas;

import dominio.Livro;

public class Tela {

  public void imprime(String msg) {
    System.out.println(msg);
  }//imprime()

  //Exercício 3.6.
  public void imprimeLivro(Livro livro) {
    System.out.println("Livro: "       + livro.getCodigo() + 
                       ", Armario "    + livro.getPrateleira().getArmario().getNome() + 
                       ", Prateleira " + livro.getPrateleira().getNumero() + 
                       ", "            + textoDisponivel(livro));
  }//imprimeLivro()
  
  public void imprimeLivroLocalizacao(Livro livro) {
    System.out.println("Livro: " + livro.getCodigo() + ", Armario " + livro.getPrateleira().getArmario().getNome() + ", Prateleira " + livro.getPrateleira().getNumero());
  }//imprimeLivroLocalizacao()
  
  public void imprimeLivroResumido(Livro livro) {
    System.out.println("Livro: " + livro.getCodigo() + ", " + textoDisponivel(livro));
  }//imprimeLivroResumido()
  
  private String textoDisponivel(Livro livro) {
    String disp;
    if ( livro.getDisponivel() ) { 
      disp = "disponivel";
    }
    else {
      disp = "indisponivel";
    }
    return disp;
  }//textoDisponivel()
  
}//Tela