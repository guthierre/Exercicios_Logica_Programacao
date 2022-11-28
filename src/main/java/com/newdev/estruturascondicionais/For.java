package com.newdev.estruturascondicionais;

import java.sql.SQLOutput;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        String nomeProduto;
        double precoCusto= 0.00d;
        double precoVenda=0.00d;

        double totalCusto = 0.00d;
        double totalVenda = 0.00d;
        int i = 0;
        for (; i < 40; i++) {
            System.out.println("Nome do produto: ");
            nomeProduto = leitorScanner.next();
            System.out.println("Preço de custo do produto: ");
            precoCusto = leitorScanner.nextDouble();
            System.out.println("Qual preço de venda do produto: ");
            precoVenda = leitorScanner.nextDouble();
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto == precoVenda) {
                System.out.println("Houve um empate entre preço de custo e preço de venda");
            } else {
                if (precoCusto > precoVenda) {
                    System.out.println("Houve perda de lucro no produto:");
                } else {
                    System.out.println("Houve lucro!");
                }
            }
            System.out.println(nomeProduto+ ",Preço de custo ="+ precoCusto+ ", preço de venda ="+ precoVenda);

        }
        System.out.printf("A Media de preço de custo é= %.2f ", (totalCusto / i));;
        System.out.printf("A Media de lucro  é = %.2f",(totalVenda / i));



    }
}
