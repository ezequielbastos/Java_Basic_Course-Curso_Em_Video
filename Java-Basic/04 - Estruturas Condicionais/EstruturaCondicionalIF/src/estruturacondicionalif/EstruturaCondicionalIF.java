package estruturacondicionalif;

import java.util.Scanner;

/**
 *
 * @author Ezequiel Bastos
 */
public class EstruturaCondicionalIF {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner imput = new Scanner(System.in);
        System.out.print("Qual seu nome: ");
        String nome = imput.nextLine();
        System.out.print("Em que ano vc nasceu? ");
        int nasc = imput.nextInt();
        int idade = 2021-nasc;
        System.out.println("Olá "+ nome +" Sua idade é " + idade);
        if (idade>=18){
            System.out.println("Vc já er de Maior");
        }else{
            System.out.println("Vc ainda é de Menor");
        }
    }
    
}
