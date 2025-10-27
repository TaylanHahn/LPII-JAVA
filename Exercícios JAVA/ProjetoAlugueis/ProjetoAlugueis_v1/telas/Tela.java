package telas;

import dominio.Edificio;
import dominio.Apto;
import dominio.AptoTipoA;
import dominio.AptoTipoB;

public class Tela {

    public static void imprime(Edificio e) {
    	String txtTipoApto="";
    	String txtNomeInquilino="";
    	
        System.out.printf("Edifício %s \n", e.getNome());
        System.out.println("Andar\tNum.\tArea\tTipo\tPB\tPE\tPF\tAlugado\tInquil.");
        
        for (Apto apto: e.getAptos()) {
        	
        	if (apto instanceof AptoTipoA) {
        		txtTipoApto = "A";
        	}
        	if (apto instanceof AptoTipoB) {
        		txtTipoApto = "B";
        	}
        	
        	if (apto.isAlugado()) {
        	   txtNomeInquilino = apto.getInquilino().getNome();
        	}
        	else {
        	   txtNomeInquilino = "---";
        	}
        	
            System.out.printf("%d\t%d\t%4.1f\t%-4s\t%-2.2f\t%-2.2f\t%-2.2f\t%-7s\t%-7s\n",
                    apto.getAndar(), apto.getNum(), apto.getArea(), txtTipoApto,
                     (10 * apto.getArea()), apto.precoExtra(), apto.precoFinal(), apto.isAlugado(), txtNomeInquilino );
        }//for
        
    }//imprime()

}//Fim classe Tela.
