package entrada_saida_de_dados;

import java.util.Locale;
import java.util.Scanner;

/** 
 * @author Ezequiel Bastos
 * @version 1.0
 * @since 2021-02-24
 */
public class Entrada_Saida_De_Dados {
    
    public static void main(String[] args) {
        
    //A linha a baixo serve para que não haja erro de . ou , quando usarmos Double ou Float   
    Locale.setDefault(Locale.US); //Troca a , por .
    
        //A linha a baixo cria o obj imput para fazer get dos imputs e setar nas variaveis!
    Scanner imput = new Scanner(System.in);
    
    System.out.print("Digite seu nome: "); //Saida de dados - Output
        String nome = imput.nextLine(); //Entrada de dados - Imput
    System.out.print("Digite sua idade: ");
        int idade = imput.nextInt();
    System.out.print("Digite sua nota: ");
        float nota = imput.nextFloat();
    System.out.println("---------------------------\n");
    
    //Mostrando a saida dos dados obtidos no console
        //Maneira de saida com "println"
        System.out.println("Maneira de saida com println");
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua nota é: " + nota);
        System.out.println("Sua nota é: " + nome + "Sua idade é: " + idade + "Sua nota é: " + nota);
    System.out.println("---------------------------\n");
    
        //Maneira de saida com "printlf"
        System.out.printf("Maneira de saida com printlf \n");
        System.out.printf("%s \n", nome);
        System.out.printf("%d \n", idade);
        System.out.printf("%.2f \n", nota); //O 2 representa a quantidade de casas decimais a ser mostrado!
        System.out.printf("Seu nome é: %s Sua idade é: %d Sua nota é: %.1f \n", nome, idade,nota);
    System.out.println("---------------------------\n");
    
        //Maneira de saida com "format"
        System.out.format("Maneira de saida com format");
        System.out.format("Seu nome é %s: \n", nome);
        System.out.format("Sua idade é %d: \n", idade);
        System.out.format("Sua nota é: %.2f \n", nota);
        System.out.format("Seu nome é: %s Sua idade é: %d Sua nota é: %.3f \n", nome, idade,nota);
    }   
    
}
