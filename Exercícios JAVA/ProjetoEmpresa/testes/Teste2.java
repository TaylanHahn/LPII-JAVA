package testes;

import java.util.ArrayList;
import java.util.List;

import dominio.Empr;
import dominio.EmprA;
import dominio.EmprX;
import dominio.Filial;
import dominio.Gerente;
import telas.TelaEmpresa;

public class Teste2 {

  public static void main(String[] args) {
    System.out.println("========== Teste 2 ==========");
    
    Empr emp;
    Gerente g10, g20;
    
    //Questão 3
    
    g10 = new Gerente("Ger10", 10);
    g20 = new Gerente("Ger20", 20);

    List<Empr> lista_empr = new ArrayList<Empr>(); //Questão 4
    
    emp = new EmprA("Abc");
    lista_empr.add(emp); //Questão 4

    emp.addFilial(new Filial("F111", 1000, g10));
    emp.addFilial(new Filial("F112", 2000, g10));
    emp.addFilial(new Filial("F113", 3000, g10));
    emp.addFilial(new Filial("F121", 4000, g20));

    emp = new EmprX("Xyz");
    lista_empr.add(emp); //Questão 4
    
    emp.addFilial(new Filial("F211",  600, g10));
    emp.addFilial(new Filial("F221", 1000, g20));
    
    //Questão 4
    
    for(Empr e: lista_empr) {
      System.out.println("Empresa: " + e.getNome());
      if (e instanceof EmprA) {
        System.out.println("Tipo: A");
      }
      else if (e instanceof EmprX) {
        System.out.println("Tipo: X");
      }
      System.out.printf("Filial   | Fat.    | Gerente | Sal. Base\n");
      for (Filial f: e.getFiliais()) {
        System.out.printf("%-9s|%-9.0f|%-9s|%-9.0f\n", f.getNome(), f.getFaturamento(), f.getGerente().getNome(), f.getGerente().getSalBase());
      }
      System.out.printf("Fat. Total = %.0f\n", e.fatTotal());
      System.out.printf("Sal. Total = %.0f\n", e.salTotal());
      System.out.printf("Tx. Com.   = %.0f\n", e.txCom()*100);
      System.out.printf("Distr.     = %.0f\n", e.distr());
      System.out.printf("Luco       = %.0f\n", e.lucro());
      System.out.println();
      
    }
    
    TelaEmpresa tela = new TelaEmpresa();
    
    //Questão 5
    tela.relatorio(lista_empr);
    
    //Questão 6
    tela.relatorioGerente(lista_empr, g10);

  }//main()

}//Teste.
