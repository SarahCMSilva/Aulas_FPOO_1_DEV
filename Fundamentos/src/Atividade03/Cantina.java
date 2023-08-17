/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade03;

/**
 *
 * @author Aluno
 */
public class Cantina {
    
        private CantinaEnum cantina;
        private double preco;

    public Cantina(CantinaEnum cantina, double preco) {
        this.cantina = cantina;
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "cantina{" + "cantina=" + cantina + ", preco=" + preco + '}';
    }
        
        
    
}
