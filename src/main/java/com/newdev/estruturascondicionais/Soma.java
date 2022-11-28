package com.newdev.estruturascondicionais;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o numero que deseja somar: ");
        int numero = leitorScanner.nextInt();
        System.out.println("Digite o numero que deseja somar: ");
        int numero2 = leitorScanner.nextInt();
        int soma = numero + numero2;
        int div = numero / numero2;
        int sub = numero * numero2;
        System.out.println (numero + " e " + numero2 + " Os resultados da soma, divisão e subtração é Soma " +  soma +
                " divisão " + div + " subtração " +sub);

    }
}
