package testes;

import java.util.ArrayList;
import java.util.List;

import dominio.Empr;
import dominio.EmprA;
import dominio.EmprX;
import dominio.Filial;
import dominio.Gerente;
import telas.TelaEmpresa;

public class Teste1 {

  public static void main(String[] args) {
    System.out.println("========== Teste 1 ==========");
    
    //Questão 3
    
    //Instancia Gerentes:
    Gerente g10, g20;
    g10 = new Gerente("Ger10", 10);
    g20 = new Gerente("Ger20", 20);
    
    //Instancia Empresas:
    Empr ea = new EmprA("Abc");
    Empr ex = new EmprX("Xyz");
    
    //Instancia Filiais com respectivo Gerente:
    Filial f111 = new Filial("F111", 1000, g10);
    Filial f112 = new Filial("F112", 2000, g10);
    Filial f113 = new Filial("F113", 3000, g10);
    Filial f121 = new Filial("F121", 4000, g20);
    
    Filial f211 = new Filial("F211",  600, g10);
    Filial f221 = new Filial("F221", 1000, g20);
    
    //Adiciona as Filiais nas respectivas Empresas: 
    ea.addFilial(f111);
    ea.addFilial(f112);
    ea.addFilial(f113);
    ea.addFilial(f121);
    
    ex.addFilial(f211);
    ex.addFilial(f221);
    
    //Questão 4
    
    List<Empr> lista_empr = new ArrayList<Empr>();
    lista_empr.add(ea);
    lista_empr.add(ex);
    
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

}//Teste1.
