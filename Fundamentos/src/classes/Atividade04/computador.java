/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Atividade04;

import java.security.PublicKey;

/**
 *
 * @author Aluno
 */
public class computador {
    private boolean computador;
    private MemoriaEnum memoria;
    private ProcessadorEnum processador;
    private int discoRigido;
    private String sistemaOperacional;

    public computador(MemoriaEnum memoria, ProcessadorEnum processador, int discoRigido, String sistemaOperacional) {
        this.memoria = memoria;
        this.processador = processador;
        this.discoRigido = discoRigido;
        this.sistemaOperacional = sistemaOperacional;
    }
    
    public void computadorFuncionando(){
        if (computador = true) {
            System.out.println("esta em funcionamento");
        }else{System.out.println("Ocorreu algum problema");}}
    
    public void SitemasOperacional(){
        if (computador ) {
            if (sistemaOperacional == "Linux") {
                System.out.println("Seu sitema operacional é Linux");
            }
            if (sistemaOperacional == "windowns") {
                System.out.println("Seu sitema operacional é windowns");
            }
            if (sistemaOperacional == "Mac") {
                System.out.println("Seu sitema operacional é windowns");
            }else{
                System.out.println("Ocorreu um erro");
            }
        }
    }

    public void setMemoria(MemoriaEnum memoria) {
        this.memoria = memoria;
    }

    public void setProcessador(ProcessadorEnum processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "computador{" + "computador=" + computador + ", memoria=" + memoria + ", processador=" + processador + ", discoRigido=" + discoRigido + ", sistemaOperacional=" + sistemaOperacional + '}';
    }
    
    
   }
    

