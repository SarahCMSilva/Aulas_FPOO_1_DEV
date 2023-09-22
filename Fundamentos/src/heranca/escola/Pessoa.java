/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Pessoa implements ValidaPessoa{
    private String nome;
    private String email;
    private int idade;
    private String genero;

    public Pessoa(String nome, String email, int idade, String genero) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.genero = genero;
    }

    public String getEmail() {
        return email;
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
        return "Pessoa{" + "nome=" + nome + ", email=" + email + ", idade=" + idade + ", genero=" + genero + '}';
    }
    
    
    //&& this.email.contains("@yahoo") / se quiser por no mesmo metodo o yahoo
    @Override
    public boolean verificarDominioEmailGmail(String email) {
        if (this.email.contains("@gmail")  ) {
            System.out.println("Seu email foi confirmado");
            return true;
        } else {
            System.out.println("Seu email nao foi identificado");
            return false;
        }
    }
    
    @Override
    public boolean verificarDominioYahoo(String email) {
        if (this.email.contains("@yahoo")  ) {
            System.out.println("Seu email foi confirmado");
            return true;
        } else {
            System.out.println("Seu email nao foi identificado");
            return false;
        }
    }

    
   
}
