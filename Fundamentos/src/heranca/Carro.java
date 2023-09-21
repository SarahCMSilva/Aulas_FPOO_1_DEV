/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Carro extends Veiculo{
    // extends herda todos os valores do veiculo
    private int qtdePortas;
    private String modeloCambio;
    private String combustivel;

    //construtor pelo insert
//    public Carro(int qtdePortas, String modeloCambio, String combustivel, String descricao, int ano, String cor, String modelo, String marca, double valor, boolean zerokm, boolean freioAbs) {
//        super(descricao, ano, cor, modelo, marca, valor, zerokm, freioAbs);
//        this.qtdePortas = qtdePortas;
//        this.modeloCambio = modeloCambio;
//        this.combustivel = combustivel;
//    }
    
    //add construtor pela lampada
    public Carro(String descricao, int ano, String cor, String modelo, String marca, double valor, boolean zerokm, boolean freioAbs, int qtdePortas, CambioEnum cambioEnum, CombustivelEnum combustivelEnum) {
        super(descricao, ano, cor, modelo, marca, valor, zerokm, freioAbs);
        
        this.qtdePortas = qtdePortas;
        this.modeloCambio = cambioEnum.getTipoCambio();
        this.combustivel =  combustivelEnum.getTipoCombustivel();
    }

    @Override
    public String toString() {
        return super.toString() + "\nCarro{" + "qtdePortas=" + qtdePortas + ", modeloCambio=" + modeloCambio + ", combustivel=" + combustivel + '}';
    }
    
    
    
    
}
