package com.newdev.estruturascondicionais;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
//Atribuir temp = x.
//Atribuir y a x: x = y.
//Atribuir temp a y: y = temp.
public class Variaveisab {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner (System.in);
        //Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a
        //possuir o valor da variável B e a variável B passe a possuir o valor da variável A Apresentar os valores
        //trocados;
        System.out.println("Valor do A");
        int valorA = leitorScanner.nextInt();
        System.out.println("Valor B");
        int valorB = leitorScanner.nextInt();
        int auxiliar = valorB;
        valorB = valorA;
        valorA = auxiliar;
        System.out.println("O Valor de A " +valorA +" o valor de B "+ valorB );








    }
}
