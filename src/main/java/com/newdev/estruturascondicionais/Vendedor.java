package com.newdev.estruturascondicionais;
import java.util.Scanner;
//Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
//por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
//efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
public class Vendedor {
    public static void main(String[] args) {
       Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Qual é o nome do vendedor");
       String nome = leitorScanner.next();
        System.out.println(nome);
        double salarioFixo = 1000.0;
        System.out.println("Qual o valor de vendas?");
        float totVendas = leitorScanner.nextFloat();

        double totComiss = totVendas * 15 / 100;

        double salarioFim = salarioFixo + totComiss;

        System.out.println("O Vendedor " + nome + "que tem o salario fixo de "+ salarioFixo +"R$ fez o total de vendas "+
                totVendas + "e o salario final será de  " +salarioFim +"R$" );

    }
}
