/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Estacionamento {
    public static void main(String[] args) {
        Carro gol = new Carro("Concervado", 1999, "Vermelho", "G2", "Volkswagem",13999.00, false, false, 5, CambioEnum.MANUAL, CombustivelEnum.GASOLINA);
        System.out.println(gol);
    }
}
