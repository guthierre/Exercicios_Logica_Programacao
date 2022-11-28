package com.newdev.estruturascondicionais;

import java.util.Scanner;

public class Estruturaenquanto {

    public static void main(String[] args) {

        int totalAlunos = 5;
        Scanner leitorScanner = new Scanner(System.in);

        while (totalAlunos > 0) {

            String nomeAluno = leitorScanner.nextLine();
            int idadeAluno = leitorScanner.nextInt();
            System.out.println("O Nome do aluno é: " + nomeAluno + " e sua idade é: " + idadeAluno);
            totalAlunos = totalAlunos - 1;
        }


    }


}
