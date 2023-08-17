/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade03;

/**
 *
 * @author Aluno
 */
public class Meses {
    private int dia;
    private String meses;
    private int ano;

    public Meses(int dia, String meses, int ano) {
        this.dia = dia;
        this.meses = meses;
        this.ano = ano;
    }

    public void setMeses(String meses) {
        this.meses = meses;
    }
    
    @Override
    public String toString() {
        return "Meses{" + "dia=" + dia + ", meses=" + meses + ", ano=" + ano + '}';
    }
    
    
}
