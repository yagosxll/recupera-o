/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacao;

/**
 *
 * @author Aluno
 */
public enum Bonificacao {
    GERENTE(0.35),
    DIRETOR(0.45);
    
    private final double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    
            
           
    
    
    
}
