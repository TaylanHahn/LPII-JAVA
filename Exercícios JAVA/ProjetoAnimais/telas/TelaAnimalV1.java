package telas;
import java.util.List;

import dominio.Animal;
import dominio.Estado;
import dominio.Regiao;


public class TelaAnimalV1 {

	public void mostraAnimal(Animal a){
		System.out.println("");
    System.out.printf("nome      (Tipo)    Peso      Velocid.  Forca     Estados \n");
		System.out.println("-----------------------------------------------------------------------");
		//System.out.print(a.getNome() + "	("+ a.getClass().getSimpleName() + ")" + "	" + a.getPeso() + "KG" + "	" + a.velocidade() + "Km/h" + "	" + a.forca() + "	");
    System.out.printf("%s (%s), %.0fKg, %.0fKm/h, Forca=%.0f, Estados: ", a.getNome(), a.getClass().getSimpleName(), a.getPeso(), a.velocidade(), a.forca());
		for(Estado est: a.getRegiao().getEstados()){
			System.out.print(est.getSigla() + " ");
		}
		System.out.println();	
		System.out.println("-----------------------------------------------------------------------");
	}//mostraAnimal()

	public void mostraAnimaisSul(List<Animal> lista) {
    System.out.printf("nome      (Tipo)    Peso      Velocid.  Forca     Estados \n");
		System.out.println("-----------------------------------------------------------------------");
		for(Animal a: lista){
			if(a.getRegiao().getNome().equals("Sul")){
				//System.out.print(a.getNome() + "	("+ a.getClass().getSimpleName() + ")" + "	" + a.getPeso() + "KG" + "	" + a.velocidade() + "Km/h" + "	" + a.forca() + "	");
	      System.out.printf("%s (%s), %.0fKg, %.0fKm/h, Forca=%.0f, Estados: ", a.getNome(), a.getClass().getSimpleName(), a.getPeso(), a.velocidade(), a.forca());
				for(Estado est: a.getRegiao().getEstados()){
					System.out.print(est.getSigla() + " ");
				}
			}//if
		}//for Animal
		System.out.println();
	}//mostraAnimaisSul

	public void mostraAnimaisRegiao(List<Animal> lista, Regiao reg) {
    System.out.printf("nome      (Tipo)    Peso      Velocid.  Forca     Estados \n");
		System.out.println("-----------------------------------------------------------------------");
		for(Animal a: lista){
			if(a.getRegiao() == reg){
				//System.out.print(a.getNome() + "	("+ a.getClass().getSimpleName() + ")" + "	" + a.getPeso() + "KG" + "	" + a.velocidade() + "Km/h" + "	" + a.forca() + "	");
	      System.out.printf("%s (%s), %.0fKg, %.0fKm/h, Forca=%.0f, Estados: ", a.getNome(), a.getClass().getSimpleName(), a.getPeso(), a.velocidade(), a.forca());
				for(Estado est: a.getRegiao().getEstados()){
					System.out.print(est.getSigla() + " ");
				}
				System.out.println();
			}//if Regiao
		}//for Animal
		System.out.println();
	}//mostraAnimaisRegiao

}//TelaAnimalV1.