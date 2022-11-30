package com.newdev.objeto;

import java.util.Date;

public class Herança {
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setNome("Guthierre");
        v.setSalario(1000.0f);
        v.getCpf("10010010");
        v.setDataNascimento(new Date());
        v.getComissaoPorItens(10.0f);
        v.getTotalItensVendidos(10);

        v.calcularSalario();
        System.out.println("O Salario do vendendor: " + v.calcularSalario());


        Motorista m = new Motorista();{



        }
    }
}




