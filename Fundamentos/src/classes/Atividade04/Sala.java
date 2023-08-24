/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Atividade04;

/**
 *
 * @author Aluno
 */
public class Sala {
    private int numeroCadeiras;
    private int numeroMesas;
    private int numeroSala;
    private boolean temProjetor;
    private int numeroComputadores;
    private int qtdeAlunos;
    private boolean disponivel;

    public Sala(int numeroCadeiras, int numeroMesas, int numeroSala, boolean temProjetor, int numeroComputadores,int qtdeAlunos,boolean disponivel) {
        this.numeroCadeiras = numeroCadeiras;
        this.numeroMesas = numeroMesas;
        this.numeroSala = numeroSala;
        this.temProjetor = temProjetor;
        this.numeroComputadores = numeroComputadores;
        this.qtdeAlunos = qtdeAlunos;
        this.disponivel = disponivel;
    }
    
    public void numeroLugares(){
        
        if (this.numeroCadeiras < this.qtdeAlunos) {
            System.out.println("Cadeiras insuficientes");
        }if (this.numeroMesas < this.qtdeAlunos) {
            System.out.println("Mesas insuficentes");
        }if (this.numeroComputadores < this.qtdeAlunos) {
            System.out.println("Computadores insuficientes");
        }else{
           System.out.println("Sala completa"); 
        }
    }
    public boolean apresentacao(){
       return this.temProjetor;
    }

    @Override
    public String toString() {
        return "Sala{" + "numeroCadeiras=" + numeroCadeiras + ", numeroMesas=" + numeroMesas + ", numeroSala=" + numeroSala + ", temProjetor=" + temProjetor + ", numeroComputadores=" + numeroComputadores + ", qtdeAlunos=" + qtdeAlunos + ", disponivel=" + disponivel + '}';
    }
        
    }
