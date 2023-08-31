/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package orientacaoobjetos.atividade05;

/**
 *
 * @author Aluno
 */
public interface ClassificacaoPost {
    public int ESTRELAS_COMUM = 1;
    public int ESTRELAS_LEGAL = 3;
    public int ESTRELAS_SUPER = 5;
    
    public boolean validarUsuario(String usuario);
    public boolean verificarTitulo(String titulo);
    public boolean verificardescricao(String descricao);
    public boolean estrelasAvaliaçao(int ClassificaoPost);
}
