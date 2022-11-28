package com.newdev.estruturascondicionais;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Alunomedia2 {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        float media = 7;
        System.out.println("Qual o nome do aluno?");
        String nome = leitorScanner.next();
        System.out.println("Qual a 1° nota do aluno: ");
        double nota1 = leitorScanner.nextDouble();
        System.out.println("Qual a 2° nota do aluno: ");
        double nota2 = leitorScanner.nextDouble();
        System.out.println("Qual a 3° nota do aluno: ");
        double nota3 = leitorScanner.nextDouble();
        double result = nota1 + nota2 + nota3;
        double resultado = result / 3;
        if (resultado >= media) {
            System.out.println("Você passou");
        }
        if (resultado >= 5.1 && resultado <= 6.9) {
            System.out.println("voce esta de recuperacao");
            }
        if (resultado <= 5 ) {
            System.out.println("Voce nao passou");


        }
    }

}



