package estruturacondicionalswitch;

import java.util.Scanner;

/**
 *
 * @author Ezequiel Bastos
 */
public class EstruturaCondicionalSwitch {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner imput = new Scanner(System.in);
        System.out.print("Quantas pernas: ");
        int perna = imput.nextInt();
        String tipo;
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println("Isso é um(a) "+tipo);
    }
    
}
