package com.newdev.objeto;

public class Vendedor extends Funcionario {


    private int totalItensVendidos;
    private float comissaoPorItens;

    public Vendedor() {
        super();

    }
    public float calcularSalario() {
        return super.getSalario()+ (this.comissaoPorItens*totalItensVendidos);

    }

    public void getCpf(String s) {
    }

    public int getTotalItensVendidos(int i) {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItens(float f) {
        return comissaoPorItens;
    }

    public void setComissaoPorItens(float comissaoPorItens) {
        this.comissaoPorItens = comissaoPorItens;
    }
}