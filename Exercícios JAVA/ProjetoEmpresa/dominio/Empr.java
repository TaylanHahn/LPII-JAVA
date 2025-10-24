package dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Empr {
  private String nome;
  private List<Filial> filiais = new ArrayList<Filial>();
  
  public abstract float txCom();
  
  public Empr(String n) {
    this.nome = n;
  }
  
  public String getNome() {
    return nome;
  }
  
  public float fatTotal() {
    float total=0;
    for (Filial f: this.filiais) {
      total = total + f.getFaturamento(); 
    }
    return total;
  }
  
  public float salTotal() {
    float total=0;
    for (Filial f: this.filiais) {
      total = total + f.getGerente().getSalBase();
    }
    return total;
  }
  
  public float distr() {
    return fatTotal() * txCom();
  }
  
  public float lucro() {
    return fatTotal() - salTotal() - distr();
  }
  
  public void addFilial(Filial f) {
    this.filiais.add(f);
  }
  
  public List<Filial> getFiliais() {
    return this.filiais;
  }

}//Empresa.
