/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja;

/**
 *
 * @author gabriel.alaraujo
 */
public class Eletronico extends Produto {

    private String marca;
    private String modelo;

    public Eletronico() {
    }

    public Eletronico(String nome, double preco, String marca, String modelo) {
        super(nome, preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void printDados() {
        System.out.println("Nome: " + getNome() + "Preço: " + getPreco() + "Marca: " + getModelo() + "Modelo: " + getModelo());
    }

}
