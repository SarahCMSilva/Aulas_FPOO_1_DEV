/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private String nome;
    private String email;
    private int idade;

    public Pessoa(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    
    public boolean verificarMaiorDeIdade(){
        if (this.idade >= 18) {
            return true;
            
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", email=" + email + ", idade=" + idade + '}';
    }
    
    
   
}
