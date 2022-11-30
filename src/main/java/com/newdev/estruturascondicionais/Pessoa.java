package com.newdev.estruturascondicionais;

public class Pessoa {

    //atributos
    private float peso;
    private float altura;
    public Pessoa (float peso, float altura){
        System.out.println("Executando o metodo construtor");
        this.peso = peso;
        this.altura = altura;

    }

    public float calcularIMC(){
     float imc = peso / (altura * altura);
     return imc;
    }
        //Metodos de acesso
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;

    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
}
