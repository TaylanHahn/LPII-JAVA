package testes;

import java.util.ArrayList;
import java.util.List;

import dominio.Armario;
import dominio.Livro;
import dominio.Prateleira;
import telas.Tela;

public class TestaLivros1bTela {

  public static void main(String[] args) {
    
    //3.1 instancia os livros, armarios e prateleiras:
    
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

    //3.2 coloca todos os livros em uma List: 
    
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

    Tela tela = new Tela();   
    
    tela.imprime("========================");
    tela.imprime("3.2) Listagem resumida de todos os livros:");
    for (Livro l: listaLivros) {
      tela.imprimeLivroResumido(l);
    }
    tela.imprime("");

    //3.3)Simula emprestimo desses 3 livros:
    a12.setDisponivel(false);
    b31.setDisponivel(false);
    b42.setDisponivel(false);

    //3.4)Imprime todos os livros para verificar se foram registrados os livros emprestados:
    tela.imprime("========================");
    tela.imprime("3.4) Listagem resumida de todos os livros (apos emprestimo):");
    for (Livro l: listaLivros) {
      tela.imprimeLivroResumido(l);
    }
    tela.imprime("");

    //3.5)Simula entrega desses 3 livros:
    a12.setDisponivel(true);
    b31.setDisponivel(true);
    b42.setDisponivel(true);
    
    tela.imprime("========================");
    tela.imprime("3.5a) Localização dos Livros Entregues:");
    tela.imprimeLivroLocalizacao(a12);
    tela.imprimeLivroLocalizacao(a31);
    tela.imprimeLivroLocalizacao(b42);
    
    tela.imprime("========================");
    tela.imprime("3.5b) Localização dos Livros Entregues:");
    //Coloca os livros entregues em uma List para facilitar a impressao na tela.
    List<Livro> livros_entregues = new ArrayList<Livro>();
    livros_entregues.add(a12);
    livros_entregues.add(b31);
    livros_entregues.add(b42);
    for (Livro l: livros_entregues) {
      tela.imprimeLivroLocalizacao(l);
    }
    tela.imprime("");

    //3.6) Imprime todos os livros novamente.
    tela.imprime("========================");
    tela.imprime("3.6) Listagem completa de todos os livros:");
    for (Livro l: listaLivros) {
      tela.imprimeLivro(l);
    }
    tela.imprime("");

  }//main()

}//TestaLivros1bTela.