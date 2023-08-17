/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade03;

/**
 *
 * @author Aluno
 */
public class Redes {
   private  String nome;
   private int idade;
   private RedesEnum redes;

    public Redes(String nome, int idade, RedesEnum redes) {
        this.nome = nome;
        this.idade = idade;
        this.redes = redes;
    }

    @Override
    public String toString() {
        return "Redes{" + "nome=" + nome + ", idade=" + idade + ", redes=" + redes + '}';
    }

    
   
   
}
