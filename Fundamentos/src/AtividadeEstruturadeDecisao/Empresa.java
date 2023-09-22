/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadeEstruturadeDecisao;

/**
 *
 * @author Aluno
 */
public class Empresa {
    public static void main(String[] args) {
        Aluguel c1 = new Aluguel(4, 1000, "Hb20");
        c1.Calcular();
        //print comum
        System.out.println("Carro: "+ c1.getCarro() + "\nValor por dia:" + c1.getValorDia() + "\nValor por Km: " + c1.getValorKm());
        //print toString
        System.out.println("\n" + c1);
    }
}
