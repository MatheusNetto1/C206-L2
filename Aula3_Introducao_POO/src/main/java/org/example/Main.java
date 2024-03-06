package org.example;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Eduardo", 20, 1100);
        Funcionario func2 = new Funcionario("Gabriel", 21, 800);

        /*
        Funcionario func1 = new Funcionario();
        func1.nome = "Eduardo";
        func1.idade = 20;
        func1.salario = 1100;

        Funcionario func2 = new Funcionario();
        func2.nome = "Gabriel";
        func2.idade = 21;
        func2.salario = 800;
        */

        System.out.println();
        System.out.println("Saindo com as características dos funcionários:");
        System.out.println(func1.nome);
        System.out.println(func1.salario);
        System.out.println(func1.idade);
        System.out.println();
        System.out.println(func2.nome);
        System.out.println(func2.salario);
        System.out.println(func2.idade);

        System.out.println();
        System.out.println("O  salário anual do funcionário 1 é " + func1.calculaSalarioAnual());
        System.out.println("O  salário anual do funcionário 2 é " + func2.calculaSalarioAnual());

        System.out.println();
        System.out.println("O salário com décimo terceiro do funcionário 1 é " + func1.calculaDecimoTerceiro());
        System.out.println("O salário com décimo terceiro do funcionário 2 é " + func2.calculaDecimoTerceiro());
    }
}