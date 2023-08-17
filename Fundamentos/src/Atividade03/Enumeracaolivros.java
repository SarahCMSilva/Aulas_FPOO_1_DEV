/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade03;

import Atividade03.EnumLivros;

/**
 *
 * @author Aluno
 */
public class Enumeracaolivros {
    public static void main(String[] args) {
        Livro livro = new Livro("livro", 25.99,EnumLivros.ROMANCE.getLivro() );
        System.out.println(livro);
    }
}
