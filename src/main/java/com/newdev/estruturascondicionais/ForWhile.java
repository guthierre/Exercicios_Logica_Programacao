package com.newdev.estruturascondicionais;
import java.util.Scanner;
public class ForWhile {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner (System.in);



        int desejaContinuar = 1;

        while(desejaContinuar == 1 ){
            System.out.println("1° numero?");
           int numero = leitorScanner.nextInt();
            System.out.println("Qual numero deseja somar?");
           int soma = leitorScanner.nextInt();

            System.out.println("Deseja continuar? 1/Sim e  0/Não");
                desejaContinuar = leitorScanner.nextInt();

                if (desejaContinuar == 1 ){
                   int result = numero + soma;
                    System.out.println("a soma entre o " + numero +","+ soma +" é ="+ result);
                }
             }









    }
}
