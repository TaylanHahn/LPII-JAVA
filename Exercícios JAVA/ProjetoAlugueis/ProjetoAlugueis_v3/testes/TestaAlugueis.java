package testes;

import dominio.*;
import telas.*;
import java.util.*;

public class TestaAlugueis {
	public static void main(String[] args) {
		
        //3a
        System.out.println("============================== 3a ==================================");
        Edificio edPortal = new Edificio("Portal do Sol");
        Edificio edEstelar = new Edificio("Estelar");

        Apto apto101 = new AptoTipoA(101, 1, 50, edPortal);
        Apto apto102 = new AptoTipoB(102, 1, 60, edPortal);
        Apto apto201 = new AptoTipoA(201, 2, 70, edPortal);
        Apto apto202 = new AptoTipoB(202, 2, 80, edPortal);
        Apto apto301 = new AptoTipoA(301, 3, 90, edPortal);
        Apto apto302 = new AptoTipoB(302, 3, 90, edPortal);
        
        Apto apto2001 = new AptoTipoA(2001, 2, 70, edEstelar);
        Apto apto2002 = new AptoTipoB(2002, 2, 70, edEstelar);
        Apto apto3001 = new AptoTipoA(3001, 3, 80, edEstelar);
        Apto apto3002 = new AptoTipoB(3002, 3, 80, edEstelar);
        Apto apto4001 = new AptoTipoA(4001, 4, 90, edEstelar);
        Apto apto4002 = new AptoTipoB(4002, 4, 90, edEstelar);

        //3b
        System.out.println("============================== 3b ==================================");
        List<Apto> listaAptos = new ArrayList<Apto>();
        
        listaAptos.add(apto101);
        listaAptos.add(apto102);
        listaAptos.add(apto201);
        listaAptos.add(apto202);
        listaAptos.add(apto301);
        listaAptos.add(apto302);
        
        listaAptos.add(apto2001);
        listaAptos.add(apto2002);
        listaAptos.add(apto3001);
        listaAptos.add(apto3002);
        listaAptos.add(apto4001);
        listaAptos.add(apto4002);
        
      	for (Apto apto: listaAptos ) {
        	  System.out.printf("%d, %d, %f, %b \n", apto.getAndar(), apto.getNumero(), apto.getArea(), apto.isAlugado());
        }
        
        //4
        System.out.println("============================== 4 ==================================");
        Inquilino joao, maria, pedro, paula;
        joao  = new Inquilino("João");
        maria = new Inquilino("Maria");
        pedro = new Inquilino("Pedro");
        paula = new Inquilino("Paula");

		List<Inquilino> listaInquilinos = new ArrayList<Inquilino>();
        listaInquilinos.add(joao);
        listaInquilinos.add(maria);
        listaInquilinos.add(pedro);
        listaInquilinos.add(paula);

        System.out.println("============================== 5 ==================================");
        joao.aluga(apto101);
        maria.aluga(apto302);
        pedro.aluga(apto3001);
        maria.aluga(apto3002);
        
        //6
        System.out.println("============================== 6 ==================================");
       	for (Inquilino inq: listaInquilinos ) {
       		System.out.println("");
       		System.out.println(inq.getNome());
       		for (Apto apto: inq.getAptosAlugados()) {
       	      System.out.printf("%s, %d \n", apto.getEdificio().getNome(), apto.getNumero());
       		}
       	}
		
		pedro.desaluga(apto3001);
		
        //7
        System.out.println("============================== 7 ==================================");
       	for (Inquilino inq: listaInquilinos ) {
       		System.out.println("");
       		System.out.println(inq.getNome());
       		for (Apto apto: inq.getAptosAlugados()) {
       	      System.out.printf("%s, %d \n", apto.getEdificio().getNome(), apto.getNumero());
       		}
       	}
       	
       	//8
        System.out.println("============================== 8 ==================================");
        Tela tela = new Tela(joao);
        tela.imprimeDados();
        System.out.println();
        
        tela = new Tela(maria);
        tela.imprimeDados();

		
	}//main()
	
}//Final classe TestaAlugueis.
