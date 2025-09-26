package testes;

import animais.Animal;
import animais.Cao;
import animais.Gato;

public class Teste3_Casting {

  public static void main(String[] args) {
    Object o1;
    Animal a1;
    Cao    c1;
    Gato   g1;
    
    //Cria uma instância de Cao.
    a1 = new Cao("Kiko");
    
    //Uma variável de um tipo mais específico (subclasse) não pode receber diretamente
    //um objeto de uma classe mais geral (superclasse).
    //Erro de compilação:
    //c1 = a1;
    
    //Tem que fazer a coerção (casting): diz para o compilador tratar a variável a1 como sendo do tipo Cao.
    c1 = (Cao)a1;
    
    System.out.print("c1.nome = " + c1.getNome() +  " ");    
    c1.latir();
    System.out.println();

    //Uma variável de um tipo mais específico (subclasse) não pode receber diretamente
    //um objeto de uma classe mais geral (superclasse), a não ser que se utilize o mecanismo
    //da coerção (casting)
    //Erro de compilação;
    //c1 = a1;
    //c1 = o1;
    //a1 = o1;

    //Uma variável de um tipo mais geral pode receber um objeto de um tipo mais específico:
    o1 = new Gato("Mimi");
    
    //Uma variável de um tipo mais específico (subclasse) não pode receber diretamente
    //um objeto de uma classe mais geral (superclasse).
    //Erro de compilação:
    //g1 = o1;
    
    //Tem que fazer a coerção (casting):
    g1 = (Gato)o1;
    System.out.print("g1.nome = " + g1.getNome() +  " ");
    g1.miar();
    System.out.println();

    //Não é permitido.
    //g1 = c1;
    
    //Não é permitido.
    //g1 = (Gato)c1;

    //Instancia um Gato.
    a1 = new Gato("Mimi");
    //Forçou o compilador tratar a1 como Cao, o compilador aceita, no entanto,
    //se no momento da execução o objeto a1 não for um Cão, dará erro.
    //É o caso deste exemplo:
    System.out.println("Agora vai dar erro em tempo de execução (RuntimeException), ao tentar executar a linha abaixo, pois a1 é um Gato e não um Cao.");
    System.out.println("((Cao)a1) . latir();");
    ((Cao)a1) . latir();
    System.out.println();

  }//main()

}//Teste3_Casting
