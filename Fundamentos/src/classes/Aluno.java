/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {
    //atributos
    private String nome;
    private String email;
    private int ra;
    private double media;
    private boolean passou;
    //construtor vazio
    public Aluno() {
    }
    //construtor

    public Aluno(String nome, String email, int ra, double media, boolean aprovado) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.media = media;
        this.passou = passou;
    }
   
    //acoes
   public boolean Aprovado(){
       if (this.media >= 6.0) {
           
       }
              return this.passou;

   }
   

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", media=" + media + ", passou=" + passou + '}';
    }
    
   }


