/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja;

/**
 *
 * @author gabriel.alaraujo
 */
public class App {
    public static void main(String[] args) {
        var livro1 = new Livros("Doctor Who", 59.90, "Neil gaiman");
        livro1.printDados();
        
        var produto1 = new Eletronico("Headset", 1000000, "RAZEER", "KRAKEN");
    }
}
