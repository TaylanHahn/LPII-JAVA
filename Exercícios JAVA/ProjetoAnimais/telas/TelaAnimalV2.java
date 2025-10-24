package telas;
import java.util.List;

import dominio.Animal;
import dominio.Estado;
import dominio.Regiao;


public class TelaAnimalV2 {

  public void mostraCabecalho(){
    System.out.println("");
    System.out.printf("nome      (Tipo)    Peso      Velocid.  Forca     Estados \n");
    System.out.println("-----------------------------------------------------------------------");
  }//mostraAnimal()

  public void mostraAnimalAux(Animal a){
    //System.out.print(a.getNome() + "  ("+ a.getClass().getSimpleName() + ")" + "  " + a.getPeso() + "KG" + "  " + a.velocidade() + "Km/h" + " " + a.forca() + " ");
    System.out.printf("%s (%s), %.0fKg, %.0fKm/h, Forca=%.0f, Estados: ", a.getNome(), a.getClass().getSimpleName(), a.getPeso(), a.velocidade(), a.forca());
    for(Estado est: a.getRegiao().getEstados()){
      System.out.print(est.getSigla() + " ");
    }
    System.out.println();  
  }//mostraAnimal()

	public void mostraAnimal(Animal a){
	  mostraCabecalho();
	  mostraAnimalAux(a);
		System.out.println("-----------------------------------------------------------------------");
	}//mostraAnimal()

	public void mostraAnimaisSul(List<Animal> lista) {
    mostraCabecalho();
		for(Animal a: lista){
			if(a.getRegiao().getNome().equals("Sul")){
			  mostraAnimalAux(a);
			}//if
		}//for Animal
	}//mostraAnimaisSul

	public void mostraAnimaisRegiao(List<Animal> lista, Regiao reg) {
    mostraCabecalho();
		for(Animal a: lista){
			if(a.getRegiao() == reg){
        mostraAnimalAux(a);
			}//if Regiao
		}//for Animal
	}//mostraAnimaisRegiao

}//TelaAnimalV2.