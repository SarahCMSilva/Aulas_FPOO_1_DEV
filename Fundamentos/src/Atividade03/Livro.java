/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade03;

/**
 *
 * @author Aluno
 */
public class Livro {
    private String nome;
    private double valor;
    private String categoria;

    public Livro(String nome, double valor, String categoria) {
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", valor=" + valor + ", categoria=" + categoria + '}';
    }

   
    
    
}
