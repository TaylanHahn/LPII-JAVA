package dominio;

public class Filial {
  private String nome;
  private float faturamento;
  private Gerente gerente;

  public Filial(String n, float fat, Gerente g) {
    this.nome = n;
    this.faturamento = fat;
    if (g == null) {
      throw new RuntimeException("Erro: Gerente nulo");
    }
    else {
      this.gerente = g;
    }
  }
  
  public String getNome() {
    return nome;
  }

  public float getFaturamento() {
    return faturamento;
  }
  
  public Gerente getGerente() {
    return this.gerente;
  }

}//Filial.
