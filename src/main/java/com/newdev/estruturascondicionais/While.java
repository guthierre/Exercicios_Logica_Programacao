package com.newdev.estruturascondicionais;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        int totAlunos = 10;
        while (totAlunos > 0) {
            String nomeAluno = leitorScanner.nextLine();
            int idadeAluno = leitorScanner.nextInt();
            System.out.println("O Nome do aluno: " + nomeAluno +
                    " e a idade " + idadeAluno);
        totAlunos = totAlunos - 1;
        }


    }
}
