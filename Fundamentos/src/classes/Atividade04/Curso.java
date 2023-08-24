/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Atividade04;

/**
 *
 * @author Aluno
 */
public class Curso {
    private String nome;
    private String descricao;
    private String categoria;
    private int qtdeVagas;
    private int qtdeDisponivel;
    private boolean aceito;

    public Curso(String nome, String descricao, String categoria, int qtdeVagas, int qtdeDosponiveis, boolean aceito) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.qtdeVagas = qtdeVagas;
        this.qtdeDisponivel = qtdeDisponivel;
        this.aceito = entrou();
    }

    private boolean entrou(){
        if (this.qtdeVagas > this.qtdeDisponivel) {
            System.out.println("Vagas insuficientes");
        } else{
            System.out.println("Vagas suficientes");
        } return this.aceito;
    }
    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + ", qtdeVagas=" + qtdeVagas + ", qtdeDisponivel=" + qtdeDisponivel + ", aceito=" + aceito + '}';
    }


   


   
    
}
