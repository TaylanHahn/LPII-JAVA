package exemplo_aluno;

public class TesteAluno {
    public static void main(String[] args){
        Aluno a1;
        a1 = new Aluno("Taylan", 8, 9); // instanciando a classe aluno
        // a1.nome = "Taylan";
       // a1.nota1 = 7; 

        float n;
        n = a1.nota1;
        System.out.println(n);

        System.out.println("Nome=" + a1.nome + "Nota1=" + a1.nota1);

        a1.registraNota2(9); // atribuindo a nota2
        System.out.println(a1.retornaNota2());

        System.out.println(a1.media()); 

    }
}
