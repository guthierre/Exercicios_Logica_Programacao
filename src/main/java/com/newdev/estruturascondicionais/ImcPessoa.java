package com.newdev.estruturascondicionais;
import java.util.Scanner;
public class ImcPessoa {
    public static void main(String[] args) {
        Scanner leitorScanner= new Scanner(System.in);

        Pessoa objetoPessoa = new Pessoa() ;


        System.out.println("Digite sua altura");
        objetoPessoa.peso = leitorScanner.nextFloat();
        System.out.println("Digite seu peso");
        objetoPessoa.altura = leitorScanner.nextFloat();

        System.out.println("O Seu imc é "+ objetoPessoa.calcularIMC());
    }

}
