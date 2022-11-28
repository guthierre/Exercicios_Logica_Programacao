package com.newdev.estruturascondicionais;

import java.util.Scanner;

//Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
//total percorrida pelo automóvel e o total de combustível gasto

public class Gasolina {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Quantos litros de gasolina você tem?");
        float gasolina = leitorScanner.nextFloat();
        System.out.println("Quantos km você percorreu?");
        float km = leitorScanner.nextFloat();


        float kmr = km / gasolina;
        float media = kmr;
        System.out.println("Seu carro gasta em media "+ kmr + "Lts de  gasolina por km");

    }
}
