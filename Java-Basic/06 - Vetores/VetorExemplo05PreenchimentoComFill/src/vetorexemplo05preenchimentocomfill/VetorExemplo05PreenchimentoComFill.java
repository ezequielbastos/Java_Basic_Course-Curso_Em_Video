package vetorexemplo05preenchimentocomfill;

import java.util.Arrays;

/**
 *
 * @author Ezequiel Bastos
 */
public class VetorExemplo05PreenchimentoComFill {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Preencendo varias cedulas do vetor com um numero
        int v[] = new int[20];
        Arrays.fill(v, 1);
        System.out.println("Os 20 campos do Vetor foram preenchidos com nº 1");
        for(int valor: v){
            System.out.print(valor + " ");  
        }
    }
    
}
