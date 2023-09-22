/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

import java.time.chrono.ThaiBuddhistEra;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa{
    private boolean dedicacaoExclusiva;

    public Professor(boolean dedicacaoExclusiva, String nome, String email, int idade, String genero) {
        super(nome, email, idade, genero);
        this.dedicacaoExclusiva = dedicacaoExclusiva;
    }

    
    public boolean verificarDedicacao() {
        if (this.dedicacaoExclusiva == true) {
            System.out.println("Verificado");
            return true;
        } else {
            System.out.println("Nao verificado");
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfessor{" + "dedicacaoExclusiva=" + dedicacaoExclusiva + '}';
    }
    
    
    
    
}
