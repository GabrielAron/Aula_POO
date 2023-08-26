/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja;

/**
 *
 * @author gabriel.alaraujo
 */
public class Livros extends Produto {

    private String autor;

    public Livros() {
    }

    public Livros(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void printDados() {
        System.out.println("Nome: " + getNome() + "Preço: " + getPreco() + "Autor: " + getAutor());
    }

}
