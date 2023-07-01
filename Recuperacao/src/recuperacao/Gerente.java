/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacao;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Gerente extends CargoDeConfianca{

    public Gerente(Bonificacao bonificacao, double salarioBase, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate dataNascimento) {
        super(bonificacao, salarioBase, nome, cpf, rg, endereco, setor, genero, salario, dataNascimento);
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    

    

    @Override
    public String toString() {
        return "Gerente{" + '}';
    }
    
    

    
    
    
    
    
}
