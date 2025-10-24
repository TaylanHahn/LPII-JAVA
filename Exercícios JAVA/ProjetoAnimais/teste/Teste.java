package teste;

import java.util.ArrayList;
import java.util.List;

import telas.TelaAnimalV2;
import dominio.Animal;
import dominio.Cao;
import dominio.Estado;
import dominio.Gato;
import dominio.Regiao;

public class Teste {

  public static void main(String[] args) {

    //======================= Questao 3 =============================
    List<Regiao> listaRegiao = new ArrayList<Regiao>();
    List<Estado> listaEstado = new ArrayList<Estado>();

    Regiao sul, norte;
    sul = new Regiao("Sul", 15);
    norte = new Regiao("Norte", 30);
    listaRegiao.add(sul);
    listaRegiao.add(norte);

    Estado rs, sc, pr, am, pa, rr;
    rs = new Estado("RS");
    sc = new Estado("SC");
    pr = new Estado("PR");
    am = new Estado("AM");
    pa = new Estado("PA");
    rr = new Estado("RR");
    listaEstado.add(rs);
    listaEstado.add(sc);
    listaEstado.add(pr);
    listaEstado.add(am);
    listaEstado.add(pa);
    listaEstado.add(rr);

    sul.incluiEstado(rs);
    sul.incluiEstado(sc);
    sul.incluiEstado(pr);

    norte.incluiEstado(am);
    norte.incluiEstado(pa);
    norte.incluiEstado(rr);

    //======================= Questao 4 =============================
    Cao c1, c2, c3, c4, c5, c6;
    Gato g1, g2, g3, g4, g5, g6;
    c1 =new Cao("Rex 1", 10f, sul);
    c2 =new Cao("Rex 2", 20f, sul);
    c3 =new Cao("Rex 3", 30f, sul);
    c4 =new Cao("Rex 4", 14f, norte);
    c5 =new Cao("Rex 5", 15f, norte);
    c6 =new Cao("Rex 6", 16f, norte);

    g1 =new Gato("Mimi 1", 1f, sul);
    g2 =new Gato("Mimi 2", 2f, sul);
    g3 =new Gato("Mimi 3", 3f, sul);
    g4 =new Gato("Mimi 4", 4f, norte);
    g5 =new Gato("Mimi 5", 5f, norte);
    g6 =new Gato("Mimi 6", 6f, norte);

    List<Animal> listaAnimais = new ArrayList<Animal>();
    listaAnimais.add(c1);
    listaAnimais.add(c2);
    listaAnimais.add(c3);
    listaAnimais.add(c4);
    listaAnimais.add(c5);
    listaAnimais.add(c6);
    listaAnimais.add(g1);
    listaAnimais.add(g2);
    listaAnimais.add(g3);
    listaAnimais.add(g4);
    listaAnimais.add(g5);
    listaAnimais.add(g6);

    //======================= Questao 5 =============================
    System.out.println("");
    System.out.println("Questao 5");
    System.out.printf("nome      (Tipo)    Peso      Velocid.  Forca     Estados \n");
    System.out.printf("-----------------------------------------------------------------------\n");
    for(Animal a: listaAnimais){
      //System.out.printf("%-9s (%-8s) %7.0fKg %5.0fKm/h %9.0f ", a.getNome(), a.getClass().getSimpleName(), a.getPeso(), a.velocidade(), a.forca());
      System.out.printf("%s (%s), %.0fKg, %.0fKm/h, Forca=%.0f, Estados: ", a.getNome(), a.getClass().getSimpleName(), a.getPeso(), a.velocidade(), a.forca());
      for(Estado est: a.getRegiao().getEstados()){
        System.out.print(est.getSigla() + " ");
      }
      System.out.println();
    }		
    System.out.println("-----------------------------------------------------------------------");
    System.out.println();

    //======================= Questao 6 =============================
    System.out.println("Questao 6");
    Estado estado = listaEstado.get(3);
    for (Regiao r: listaRegiao) {
      if (r.getEstados().contains(estado)) {
        System.out.println("Estado " + estado.getSigla() + " encontrado na Região " + r.getNome());
      }
    }
    System.out.println();
    
    //======================= Questao 7 =============================
    TelaAnimalV2 tela = new TelaAnimalV2();
    System.out.println("Questao 7");
    tela.mostraAnimal(c1);
    System.out.println();

    //======================= Questao 8 =============================
    System.out.println("Questao 8");
    tela.mostraAnimaisSul(listaAnimais);

    //======================= Questao 9 =============================
    System.out.println("Questao 9");
    tela.mostraAnimaisRegiao(listaAnimais, norte);

  }//main()

}//Teste
