/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Escola {
    public static void main(String[] args) {
        Professor p1 = new Professor(true, "Pedro", "pedro@gmail.com", 30);
        System.out.println(p1);
        
        Aluno a1 =new Aluno("ewiu3ew", "Nathalia", "nathalia@gmail.com", 17);
        System.out.println(a1);
    }
}
