/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author Renato Nobrega
 */
public class Conta {
    
//atributos    
   private double saldo;
   private String nome;
   private int agencia;
//metodos
    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public void imprime(){
    
        System.out.println(nome);
        System.out.println(agencia);
}
   
    
}


