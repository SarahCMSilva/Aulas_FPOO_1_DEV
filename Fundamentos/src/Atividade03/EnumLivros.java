/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade03;

/**
 *
 * @author Aluno
 */
public enum EnumLivros {
    ROMANCE("Romance"),
    TERROR("Terror"),
    FANTASIA("Fantasia"),
    MISTERIO("Mistério"),
    INFORMACAO("Informacional");
    
    private String livro;

    private EnumLivros(String livro) {
        this.livro = livro;
    }

    public String getLivro() {
        return this.livro;
    }
}
