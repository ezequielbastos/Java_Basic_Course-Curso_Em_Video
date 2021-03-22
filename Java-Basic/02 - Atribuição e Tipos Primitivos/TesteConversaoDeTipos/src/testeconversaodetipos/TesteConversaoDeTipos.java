package testeconversaodetipos;

import java.util.Scanner;

/** 
 * @author Ezequiel Bastos
 * @version 1.0
 * @since 2021-02-24
 */
public class TesteConversaoDeTipos {
    
    public static void main(String[] args) {
       //A linha a baixo cria o obj imput para fazer get dos imputs e setar nas variaveis!
    Scanner imput = new Scanner(System.in);
    
    /* Objeto imput2 criado para sulucionar problema do "Float nota4:" sobrepor
    *  na frente do "String Nota3: " causando erro por não conseguirmos preenche-lo
    */
    Scanner imput2 = new Scanner(System.in); 
    
    System.out.print("String Nota1: ");
        String nota1 = imput.nextLine();
        
    System.out.print("Int Nota2: ");
        int nota2 = imput.nextInt();
    
    System.out.print("String Nota3: "); 
        String nota3 = imput2.nextLine(); //Digitar em Srtig tem que usar o . ex 784.98
    
    System.out.print("Float nota4: ");
        float nota4 = imput.nextFloat(); //Inserir dado em Float tem que usar a , ex 6214,10
    
    
    int notaConvert1 = Integer.parseInt(nota1);
        System.out.println(notaConvert1 + " String convertido com sucesso para Integer");
    
    String notaConvert2 = Integer.toString(nota2);
        System.out.println(notaConvert2 + " Integer convertido com sucesso para String");
        
    float notaConvert3 = Float.parseFloat(nota3);
        System.out.println(notaConvert3 + " String convertido com sucesso para Flout");  
       
    String notaConvert4 = Float.toString(nota4);
        System.out.println(notaConvert4 + " Float convertido com sucesso para String");
    }
    
}