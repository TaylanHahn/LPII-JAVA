package telas;

import dominio.Apto;
import dominio.AptoTipoA;
import dominio.AptoTipoB;
import dominio.Inquilino;

public class Tela {
	private Inquilino inquilino;
	
	public Tela(Inquilino inquilino) {
		this.inquilino = inquilino;
	}
	
	public void imprimeDados() {
		System.out.println("");
		System.out.println(inquilino.getNome());
		System.out.printf("%s \t%s \t%s \t%s \t%s \t%s \t%s \t%s \n", "Edif.", "And.", "Num.", "Area", "Tipo", "PB", "PE", "PF");
		
		for (Apto apto : inquilino.getAptosAlugados()) {
	    	String txtTipoApto="";

        	if (apto instanceof AptoTipoA) {
        		txtTipoApto = "A";
        	}
        	if (apto instanceof AptoTipoB) {
        		txtTipoApto = "B";
        	}

			System.out.printf("%s \t%s \t%s \t%s \t%s \t%s \t%s \t%s \n"
					, apto.getEdificio().getNome()
					, apto.getAndar()
					, apto.getNumero()
					, apto.getArea()
					, txtTipoApto
					, apto.getArea() * 10
					, apto.precoExtra(), apto.precoFinal());
		}
		
	}//imprimeDados()
	
}//Final classe Tela.
