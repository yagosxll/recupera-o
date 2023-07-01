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
public enum Genero {
    MASCULINO("Masculliono", 'M'),
    FEMININO("Feminino", 'F');
    
    private final String texto;
    private final char caractere;

    private Genero(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaractere() {
        return caractere;
    }
    
    
    
}
