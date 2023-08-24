/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Atividade04;

/**
 *
 * @author Aluno
 */
public class Atividade {
    public static void main(String[] args) {
        Sala sala = new Sala(15, 15, 15, true, 15, 10, true);
        System.out.println(sala);
        System.out.println("------------");
        Curso curso = new Curso("lucas", "programador", "DEV", 10, 8, true);
        System.out.println(curso);
        System.out.println("------------");
        computador computador = new computador(MemoriaEnum.EPROM, ProcessadorEnum.INTEL3, 15, "Linux");
        System.out.println(computador);
        
    }
}
