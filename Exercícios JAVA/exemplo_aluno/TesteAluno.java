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

        System.out.println("Nome=" + a1.getAluno() + "Nota1=" + a1.);

        a1.setNota2(9); // atribuindo a nota2
        System.out.println(a1.getNota2());

        System.out.println(a1.media()); 

    }
}
