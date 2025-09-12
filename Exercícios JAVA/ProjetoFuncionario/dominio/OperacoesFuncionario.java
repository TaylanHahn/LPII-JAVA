import ProjetoFuncionario.dominio.Funcionario;

public class OperacoesFuncionario {
// MÉTODOS
    // AUMENTO DE SALÁRIO 
    public static void aumentaSalario(Funcionario f, double porcentagem){
    // verificações basicas de ZERO e NULL
        if(func == null){
            throw new RuntimeException("Erro: Insira um funcionário válido.");
        }

        if(porcentagem < 0){
            throw new RuntimeException("A porcentagem deve ser maior que zero!");
        }
        
        double salarioAtual = func.getSalarioBruto(); // pegando a info necessária
        double calculoAumento = salarioAtual * (porcentagem / 100.00); // calculo o aumento
        double novoSalario = salarioAtual + calculoAumento; // add ao salario atual
        f.setSalarioBruto(novoSalario); // uso o método para setar o novo salario
    }

    // TROCA DE SALÁRIO
    public static void trocaSalario(Funcionario f1, Funcionario f2){
        if(f1 == null || f2 == null){
            throw new RuntimeException("Erro: Insira um funcionário válido.");
        }
        
        // armazeno o salario de f1, para nao perde-lo
        double salarioTempF1 = f1.getSalarioBruto();

        // uso os getters e setters para inverter os salarios
        f1.setSalarioBruto(f2.getSalarioBruto);
        f2.setSalarioBruto(salarioTempF1);
    }
}
