package testeconversaodetipos;

import java.util.Locale;
import java.util.Scanner;

/** 
 * @author Ezequiel Bastos
 * @version 1.0
 * @since 2021-02-24
 */
public class TesteConversaoDeTipos {
    
    public static void main(String[] args) {
     
    //A linha a baixo serve para que não haja erro de . ou , quando usarmos Double ou Float   
    Locale.setDefault(Locale.US);
    
    //A linha a baixo cria o obj imput para fazer get dos imputs e setar nas variaveis!
    Scanner imput = new Scanner(System.in);
    
    System.out.print("String Nota1: ");
        String nota1 = imput.nextLine();
        
    System.out.print("Int Nota2: ");
        int nota2 = imput.nextInt();
        
    System.out.print("String Nota3: ");
        imput.nextLine();  //recebe o enter para que não haja erro de sobreposição da nota4 sobre a 3
        String nota3 = imput.nextLine();
           
    System.out.print("Float nota4: ");
        float nota4 = imput.nextFloat();
        
        imput.close(); //fecha o objeto! para que ele não fique aberto gatando recursos!
        
        //  BLOCO PARA VERIFICAR SE O OBJ ESTA CAPITURANDO A ENTRADA DE DADOS CORRETAMENTE!
        /*
        System.out.println("Valores sem esta convertido");
        System.out.println("---------------------------");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("---------------------------");
        */
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