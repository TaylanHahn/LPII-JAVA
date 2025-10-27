package testes;

import telas.Tela;

import java.util.ArrayList;
import java.util.List;

import dominio.Apto;
import dominio.AptoTipoA;
import dominio.AptoTipoB;
import dominio.Edificio;
import dominio.Inquilino;

public class TestaAlugueis {
    public static void main(String[] args) {
        List<Edificio> listaEdificios = new ArrayList<Edificio>();
        List<Inquilino> listaInquilinos = new ArrayList<Inquilino>();

        //3a
        System.out.println("============================== 3a ==================================");
        Apto apto101 = new AptoTipoA(101, 1, 50);
        Apto apto102 = new AptoTipoB(102, 1, 60);
        Apto apto201 = new AptoTipoA(201, 2, 70);
        Apto apto202 = new AptoTipoB(202, 2, 80);
        Apto apto301 = new AptoTipoA(301, 3, 90);
        Apto apto302 = new AptoTipoB(302, 3, 90);
        
        Apto apto2001 = new AptoTipoA(2001, 2, 70);
        Apto apto2002 = new AptoTipoB(2002, 2, 70);
        Apto apto3001 = new AptoTipoA(3001, 3, 80);
        Apto apto3002 = new AptoTipoB(3002, 3, 80);
        Apto apto4001 = new AptoTipoA(4001, 4, 90);
        Apto apto4002 = new AptoTipoB(4002, 4, 90);


        Edificio edPortal = new Edificio("Portal do Sol");
        Edificio edEstelar = new Edificio("Estelar");

        edPortal.addApartamento(apto101);
        edPortal.addApartamento(apto102);
        edPortal.addApartamento(apto201);
        edPortal.addApartamento(apto202);
        edPortal.addApartamento(apto301);
        edPortal.addApartamento(apto302);
        
        edEstelar.addApartamento(apto2001);
        edEstelar.addApartamento(apto2002);
        edEstelar.addApartamento(apto3001);
        edEstelar.addApartamento(apto3002);
        edEstelar.addApartamento(apto4001);
        edEstelar.addApartamento(apto4002);

        //3b
        System.out.println("============================== 3b ==================================");
        
        listaEdificios.add(edPortal);
        listaEdificios.add(edEstelar);
        
        for(Edificio ed: listaEdificios) {
        	System.out.printf("%s \n", ed.getNome());
        	for (Apto apto: ed.getAptos() ) {
        	  System.out.printf("%d, %d, %f, %b \n", apto.getAndar(), apto.getNum(), apto.getArea(), apto.isAlugado());
        	}
        }

        //4
        System.out.println("============================== 4 ==================================");
        Inquilino joao, maria, pedro, paula;
        joao  = new Inquilino("João");
        maria = new Inquilino("Maria");
        pedro = new Inquilino("Pedro");
        paula = new Inquilino("Paula");

        listaInquilinos.add(joao);
        listaInquilinos.add(maria);
        listaInquilinos.add(pedro);
        listaInquilinos.add(paula);

        //5
        System.out.println("============================== 5 ==================================");
        apto101.aluga(joao);
        apto302.aluga(maria);
        apto3001.aluga(pedro);
        apto3002.aluga(maria);

        //6
        System.out.println("============================== 6 ==================================");
        for(Edificio ed: listaEdificios) {
        	System.out.printf("%s \n", ed.getNome());
        	for (Apto apto: ed.getAptos() ) {
        	  if (apto.isAlugado()) {
        	    System.out.printf("%d, %s \n", apto.getNum(), apto.getInquilino().getNome());
        	  }
        	}
        }

        //7
        System.out.println("============================== 7 ==================================");
        apto302.desaluga();
        for(Edificio ed: listaEdificios) {
        	System.out.printf("%s \n", ed.getNome());
        	for (Apto apto: ed.getAptos() ) {
        	  if (apto.isAlugado()) {
        		  System.out.printf("%d, %s \n", apto.getNum(), apto.getInquilino().getNome());
        	  }
        	}
        }

        //8
        System.out.println("============================== 8 ==================================");
        Tela tela = new Tela();
        tela.imprime(edEstelar);
        

    }//main()
    
}//Fim Classe TestaAlugueis.
