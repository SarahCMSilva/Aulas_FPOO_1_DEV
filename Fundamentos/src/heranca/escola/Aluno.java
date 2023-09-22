/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa{
    private String ra;

    public Aluno(String ra, String nome, String email, int idade, String genero) {
        super(nome, email, idade, genero);
        this.ra = ra;
    }
    
    public void ra(){
        System.out.println("O aluno tem: " + this.ra.length() );
    }

    @Override
    public boolean verificarMaiorDeIdade() {
        return super.verificarMaiorDeIdade(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    @Override
    public String toString() {
        return super.toString() + "\nAluno{" + "ra=" + ra + '}';
    }
    
    
    
}
