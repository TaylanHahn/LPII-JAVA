package telas;

import java.util.List;

import dominio.Empr;
import dominio.EmprA;
import dominio.EmprX;
import dominio.Filial;
import dominio.Gerente;

public class TelaEmpresa {

  //Questão 5
  public void relatorio(List<Empr> lista) {
    System.out.println("===== Relatorio =====");
    
    for(Empr e: lista) {
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
    }//for Empresas
  }//relatorio()
  
  //Questão 6
  public void relatorioGerente(List<Empr> lista, Gerente g) {
    float tx_com;
    float fat;
    float distr;
    float tot_distr=0;
    float sal_base;
    float tot_sal=0;
    System.out.println("===== Relatorio Gerente =====");
    System.out.println("Nome do Gerente: " + g.getNome());
    System.out.println("Sal. Base      : " + g.getSalBase());
    System.out.printf("Emp      | Filial  | Fat.    |Sal. Base| Tx. Com.| Distr.\n");
    for(Empr e: lista) {
      for (Filial f: e.getFiliais()) {
        if (f.getGerente() == g) {
          tx_com    = e.txCom();
          fat       = f.getFaturamento();
          sal_base = f.getGerente().getSalBase();
          distr     = tx_com * fat;
          tot_distr = tot_distr + distr;
          tot_sal   = tot_sal   + g.getSalBase();
          System.out.printf("%-9s|%-9s|%-9.0f|%-9.0f|%-9.0f|%-9.0f\n", e.getNome(), f.getNome(), fat, sal_base, tx_com*100.0f, distr);
        }
      }//for filiais
    }//for Empresas
    System.out.printf("Totais:                       %.0f                  %.0f\n", tot_sal, tot_distr);
    System.out.printf("Total Recebido = %.0f+%.0f=%.0f\n", tot_sal, tot_distr, tot_sal+tot_distr);
    
  }//relatorioGerente()
  
}//TelaEmpresa.
