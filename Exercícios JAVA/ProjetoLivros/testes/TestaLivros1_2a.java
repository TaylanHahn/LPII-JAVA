package testes;

import java.util.ArrayList;
import java.util.List;

import dominio.Armario;
import dominio.Cliente;
import dominio.Livro;
import dominio.Prateleira;
import dominio.Socio;
import dominio.Titular;
import telas.Tela;

public class TestaLivros1_2a {

  public static void main(String[] args) {
    
    //1 instancia os Livros, Armarios e Prateleiras e Clientes:
    
    Armario a = new Armario("A");
    Armario b = new Armario("B");

    Prateleira p1a = new Prateleira(1, a);
    Prateleira p2a = new Prateleira(2, a);
    Prateleira p3a = new Prateleira(3, a);
    Prateleira p1b = new Prateleira(1, b);
    Prateleira p2b = new Prateleira(2, b);
    Prateleira p3b = new Prateleira(3, b);
    Prateleira p4b = new Prateleira(4, b);

    Livro a11 = new Livro("A11",p1a); 
    Livro a12 = new Livro("A12",p1a); 
    Livro a13 = new Livro("A13",p1a); 

    Livro a21 = new Livro("A21",p2a); 
    Livro a22 = new Livro("A22",p2a); 
    Livro a23 = new Livro("A23",p2a); 

    Livro a31 = new Livro("A31",p3a); 
    Livro a32 = new Livro("A32",p3a); 
    Livro a33 = new Livro("A33",p3a); 

    Livro b11 = new Livro("B11",p1b); 
    Livro b12 = new Livro("B12",p1b); 

    Livro b21 = new Livro("B21",p2b); 
    Livro b22 = new Livro("B22",p2b); 

    Livro b31 = new Livro("B31",p3b); 
    Livro b32 = new Livro("B32",p3b); 

    Livro b41 = new Livro("B41",p4b); 
    Livro b42 = new Livro("B42",p4b);

    //1.1 coloca todos os livros em uma List: 
    
    List<Livro> listaLivros = new ArrayList<Livro>();

    listaLivros.add(a11);
    listaLivros.add(a12);
    listaLivros.add(a13);
    listaLivros.add(a21);
    listaLivros.add(a22);
    listaLivros.add(a23);
    listaLivros.add(a31);
    listaLivros.add(a32);
    listaLivros.add(a33);

    listaLivros.add(b11);
    listaLivros.add(b12);
    listaLivros.add(b21);
    listaLivros.add(b22);
    listaLivros.add(b31);
    listaLivros.add(b32);
    listaLivros.add(b41);
    listaLivros.add(b42);

    Cliente cli1, cli2;
    cli1 = new Socio("Joao");
    cli2 = new Titular("Maria");
    
    //1.2) Imprime a lista de livros:
    System.out.println("========================");
    System.out.println("1.2) Listagem de todos os livros:");
    for (Livro l: listaLivros) {
      String disp;
      if ( l.getDisponivel() ) 
        disp = "disponivel";
      else
        disp = "indisponivel";
      System.out.println("Livro: " + l.getCodigo() + ", " + disp);
    }
    System.out.println();
    
    //Cliente Joao loca os livros
    cli1.locaLivro(a12);
    cli1.locaLivro(b31);
    cli1.locaLivro(b42);
    
    //4)Imprime todos os livros para verificar se foram registrados os livros emprestados:
    System.out.println("========================");
    System.out.println("Listagem de todos os livros (apos emprestimo):");
    for (Livro l: listaLivros) {
      String disp;
      if ( l.getDisponivel() ) 
        disp = "disponivel";
      else
        disp = "indisponivel";
      System.out.println("Livro: " + l.getCodigo() + ", " + disp);
    }
    System.out.println();

    //5)Joao entrega os livros:
    
    //Pega os livros de cli1 para verificar a sua localização:
    System.out.println("========================");
    List<Livro> livros_aux;
    livros_aux = cli1.getLivros();
    System.out.println("Livros do Joao: ");
    for (Livro l : livros_aux ) {
      System.out.println(l.getCodigo() + ". Armario " + l.getPrateleira().getArmario().getNome() + ". Prateleira " + l.getPrateleira().getNumero());
    }
    
    //Devolve livros.
    cli1.devolveLivros();

    //Caso a classe Cliente não tivesse o método devolveLivros(), 
    //poderia ser assim:
    /*
    for (Livro l : livros_aux ) {
      l.setDisponivel(true);
    }
    cli1.getLivros().clear();
    */
    
    System.out.println("========================");
    System.out.println("Livros do Joao (deve estar vazio): ");
    for (Livro l : livros_aux ) {
      System.out.println(l.getCodigo());
    }

    System.out.println("========================");
    //6) todos os livros devem estar disponíveis.
    System.out.println("Livros da biblioteca:");
    for (Livro l: listaLivros) {
      String disp;
      if ( l.getDisponivel() ) 
        disp = "disponivel";
      else
        disp = "indisponivel";
      System.out.println("Livro: " + l.getCodigo() + ", " + disp);
    }
    System.out.println();

    System.out.println();
    
    System.out.println("");
    System.out.println("Listagem completa de todos os livros:");
    for (Livro l: listaLivros) {
      System.out.print("Livro: " + l.getCodigo() + ", Armario " + l.getPrateleira().getArmario().getNome() + ", Prateleira " + l.getPrateleira().getNumero() + ", ");
      if ( l.getDisponivel() ) 
        System.out.println("disponivel");
      else
        System.out.println("indisponivel");
    }
    System.out.println();

    cli1.locaLivro(a12);
    cli1.locaLivro(b31);
    cli1.locaLivro(b42);
    
    Tela t = new Tela();
    t.imprimeLivrosCliente(cli1);
    
  }//main()

}//TestaLivros1a.