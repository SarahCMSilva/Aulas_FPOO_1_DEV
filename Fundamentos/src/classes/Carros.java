/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import classes.Carro;
import classes.CorEnum;

/**
 *
 * @author Aluno
 */
public class Carros {
    public static void main(String[] args) {
        Carro carro = new Carro("hb20", "fiat", CorEnum.CINZA, 2020, 4, Marcha.PRIMEIRA_MARCHA, 4, true);
        carro.trocarMarcha(Marcha.SEGUNDA_MARCHA);
        System.out.println(carro);
        carro.trocarMarcha(Marcha.TERCEIRA_MARCHA);
        System.out.println(carro);
    }
}
