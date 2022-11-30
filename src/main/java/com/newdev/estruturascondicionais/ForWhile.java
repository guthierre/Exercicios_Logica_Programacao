package com.newdev.estruturascondicionais;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForWhile {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        List<Integer> numero1 = new ArrayList<>();
        int numero;
        int numero2;
        int desejaContinuar = 1;
        int i = 0;
        while (desejaContinuar == 1) {

            System.out.println("Escreva um numero " + i);
            numero = leitorScanner.nextInt();
            numero1.add(numero);

            System.out.println("Deseja continuar?");
            desejaContinuar = leitorScanner.nextInt();
        }

        System.out.println(numero1);

    }
}
