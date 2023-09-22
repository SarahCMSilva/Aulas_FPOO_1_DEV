/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa{
    private boolean dedicacaoExclusiva;

    public Professor(boolean dedicacaoExclusiva, String nome, String email, int idade) {
        super(nome, email, idade);
        this.dedicacaoExclusiva = dedicacaoExclusiva;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfessor{" + "dedicacaoExclusiva=" + dedicacaoExclusiva + '}';
    }
    
    
    
    
}
