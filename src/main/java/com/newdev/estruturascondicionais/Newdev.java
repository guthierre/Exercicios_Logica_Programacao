package com.newdev.estruturascondicionais;

import java.util.Scanner;

public class Newdev {
    int numero;
    int numero2;


    public void executar() {
        visualizacao();
        int resultado = numero + numero2;
        System.out.println(" O Resutado da soma entre " + numero + " e " + numero2 + " = " + resultado);


    }

    private void visualizacao() {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o numero que deseja somar: ");
        numero = leitorScanner.nextInt();
        System.out.println("Digite o numero que deseja somar: ");
        numero2 = leitorScanner.nextInt();
    }
}



