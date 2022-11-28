package com.newdev.estruturascondicionais;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (true) {
            System.out.println("Digite um numero");
            int numero = leitorScanner.nextInt();
            if (numero == 0) {
                System.out.println("O numero é zero");

            } else {
                if (numero > 0) {
                    System.out.println("O Numero é maior que 0");
                } else {
                    System.out.println("O Numero é menor que 0");

                }
            }
            System.out.println("Deseja continuar S/N?");
            desejaContinuar = leitorScanner.next().charAt(0);


        }


    }
}
