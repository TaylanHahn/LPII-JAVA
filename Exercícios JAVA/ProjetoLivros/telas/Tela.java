package telas;

import java.util.List;

import dominio.Cliente;
import dominio.Livro;
import dominio.Socio;
import dominio.Titular;


public class Tela {

  public void imprime(String msg) {
    System.out.println(msg);
  }//imprime()

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
  
  public void imprimeLivros(List<Livro> livros) {
    System.out.println("========================================");
    for (Livro l: livros) {
      imprimeLivro(l);
    }
    System.out.println();
  }//imprimeLivros()

  public void imprimeLivrosLocalizacao(List<Livro> livros) {
    System.out.println("========================================");
    for (Livro l: livros) {
      imprimeLivroLocalizacao(l);
    }
    System.out.println();
  }//imprimeLivrosLocalizacao()
  
  public void imprimeLivrosResumido(List<Livro> livros) {
    System.out.println("========================================");
    for (Livro l: livros) {
      imprimeLivroResumido(l);
    }
    System.out.println();
  }//imprimeLivrosResumido()
  
  public void imprimeLivrosCliente(Cliente cli) {
    
    String tipo = "";
    if (cli instanceof Socio) {
      tipo = "Sócio";
    }
    else if (cli instanceof Titular) {
      tipo = "Titular";
    }
    else {
      tipo = "Desconhecido";
    }
    System.out.println("------------- Tela ------- ");
    System.out.println("Nome: " + cli.getNome() + " (" + tipo + ")");
    System.out.println("Livros");
    imprimeLivrosLocalizacao(cli.getLivros());
    System.out.println("Quantidade de Livros = " + cli.quantidadeLivros());
    System.out.println("Valor a pagar:");
    System.out.println("Locacao  = (" + cli.quantidadeLivros() + " x R$ 2,00) = " + cli.quantidadeLivros() * 2.0f);
    System.out.println("Desconto = " + cli.desconto());
    System.out.println("Total    = " + cli.valorTotalDevido());
    System.out.println();

  }//imprimeLivrosCliente()

}//Tela