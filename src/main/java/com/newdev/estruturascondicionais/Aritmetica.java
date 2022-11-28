package com.newdev.estruturascondicionais;

import java.util.Scanner;

//Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
//No finalinformar o nome do aluno e a sua média
public class Aritmetica {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Qual o nome do aluno?");
        String nome = leitorScanner.next();
        System.out.println("Qual foi a primeira nota do aluno?");
        float nota1 = leitorScanner.nextFloat();
        System.out.println("Qual foi a segunda nota do aluno?");
        float nota2 = leitorScanner.nextFloat();
        System.out.println("Qual foi a terceira nota do aluno?");
        float nota3 = leitorScanner.nextFloat();
        float result = nota1 + nota2 + nota3;
        float alunor = result / 3;
        int media = 7;
        System.out.println("O Aluno(A) " + nome + " teve media de : " + alunor);
        if(media >= result){
            System.out.println("Você foi aprovado");

        }else{
            System.out.println("Reprovado");
        }


    }
}
