package com.newdev.estruturascondicionais;


import java.util.Scanner;


public class Resumo {
    public static void main(String[] args) {

        int numero;

        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite um valor");
        numero = leitorScanner.nextInt();

        if (numero >= 100 && numero <= 200 ){
            System.out.println("o numero está no intervalo");

        } else{
            System.out.println("O numero nao está no intervalo");
        }


    }

}
