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
public class TestarConta {
    
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.setNome("Renato");
        conta.imprime();
        
        System.out.println(conta.getNome());
    }
}
