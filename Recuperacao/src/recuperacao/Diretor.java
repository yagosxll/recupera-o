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
public class Diretor extends CargoDeConfianca implements Contratacao{
    private final double PREMIO = 0.5;

    public Diretor(Bonificacao bonificacao, double salarioBase, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate dataNascimento) {
        super(bonificacao, salarioBase, nome, cpf, rg, endereco, setor, genero, salario, dataNascimento);
    }

    

    @Override
    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    @Override
    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    
    
    

    

    @Override
    public String toString() {
        return super.toString()+ "\n PREMIO: " + (PREMIO * 45) + "%" +
               "\n Salario Final: " + Util.formatarDinheiro(getSalarioFinal());
        
                  
    }
    
    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("adimitir funcionario:");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir funcionario:");
    }
    @Override
    public double getSalarioFinal() {
    double salarioFinal = 0;
        salarioFinal += super.salarioBase * this.PREMIO;
        salarioFinal += super.salarioBase;
        return salarioFinal;
    
    
    
    

    
    
    

    

    
    
    } 
    
}
