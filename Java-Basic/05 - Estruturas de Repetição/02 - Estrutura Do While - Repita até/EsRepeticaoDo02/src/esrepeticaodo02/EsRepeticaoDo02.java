package esrepeticaodo02;

import java.util.Scanner;

/**
 *
 * @author Ezequiel Bastos
 */
public class EsRepeticaoDo02 {

    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0;
        String resp;
        Scanner imput = new Scanner(System.in);
        do{
            System.out.print("Digite um numero: ");
            n = imput.nextInt();
            s += n; //s = s + n;
            System.out.print("Quer continuar? [S/N] ");
            resp = imput.next();
        }while(resp.equals("S"));
        System.out.println("A soma de todos os valores é " + s);
    }
    
}
