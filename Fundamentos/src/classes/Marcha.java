/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public enum Marcha {
    PRIMEIRA_MARCHA("Primeira Marcha", 1),
    SEGUNDA_MARCHA("Segunda Marcha", 2),
    TERCEIRA_MARCHA("Terceira Marcha", 3),
    QUARTA_MARCHA("Quarta Marcha", 4),
    MARCHA_RE("Marcha ré", -5),
    NEUTRO("Neutro", 0);
    
    private String marcha;
    private int numeroMarcha;
    
    private Marcha(String marcha, int numeroMarcha){
        this.marcha = marcha;
        this.numeroMarcha = numeroMarcha;
    }

    public String getMarcha() {
        return this.marcha;
    }
    public int getNumeroMarcha() {
        return this.numeroMarcha;
    }
    
}
