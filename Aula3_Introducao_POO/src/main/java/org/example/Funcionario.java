package org.example;

public class Funcionario {

    String nome;
    int idade;
    double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public double calculaSalarioAnual(){
        double salarioAnual = salario * 12;
        return salarioAnual;
    }

    public double calculaDecimoTerceiro(){
        double salariDecimoTerceiro = salario * 13;
        return salariDecimoTerceiro;
    }
}
