/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversoesdetipos;

/** 
 * @author Ezequiel Bastos
 * @version 1.0
 * @since 2021-02-24
 */
public class ConversoesDeTipos {
    
    public static void main(String[] args) {
        int valor = 31;
        //Maneira incorreta de converter inteiro para String!
        /* String valor = idade; */
        /* String valor = (int) idade; */
        /* String valor = (String) idade; */
        
        //Maneira correta de conversão de Int para String
        String idade = Integer.toString(valor);
        System.out.println("Á idade é: " + idade);
        
        //----------------------------------------------------------------------
        
        //fazer o inverso passar um numero em String para Int
        String valor2 = "852123456";
        
        //Maneira incorreta de converter String para Int!
        /* int idade = valor; */
        /* int idade = (int) valor; */
        /* int idade = (String) valor; */
        
        //Maneira correta de conversão de String para Int
        int cpf = Integer.parseInt(valor2);
        System.out.println("Seu CPF: " + cpf);
        
        //----------------------------------------------------------------------
        
        //Para converter Flout e so trocar os valores
        String valor3 = "70.3";
        float peso = Float.parseFloat(valor3);
        System.out.println("O peso é: " + peso);
        
        float valor4 = 79.6f;
        String altura = Float.toString(valor4);
        System.out.println("A sua atura é: " + altura);
    }
    
}
