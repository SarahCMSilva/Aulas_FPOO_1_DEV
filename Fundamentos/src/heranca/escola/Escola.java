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
        Professor p1 = new Professor(true, "Lucas", "lucas@gmail.com", 28, "masculino");
        p1.verificarDominioEmailGmail(p1.getEmail());
        p1.verificarDedicacao();
        System.out.println(p1);
        System.out.println("-------------------------------------------");
        
        Aluno a1 = new Aluno("swig254", "Fernando", "fe@gmail.com", 17, "masculino");
        a1.verificarDominioEmailGmail(a1.getEmail());
        System.out.println(a1);
        System.out.println("-------------------------------------------");
        
        Professor p2 = new Professor(true, "joao", "joao@yahoo.com", 28, "masculino");
        p2.verificarDominioYahoo(p2.getEmail());
        p1.verificarDedicacao();
        System.out.println(p2);
        System.out.println("-------------------------------------------");
        
        Aluno a2 = new Aluno("sijfw283", "Daniel", "dani@yahoo.com", 17, "feminino");
        a2.verificarDominioYahoo(a2.getEmail());
        a2.ra();
        System.out.println(a2);
        System.out.println("-------------------------------------------");
    }
}
