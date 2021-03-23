package vetorexemplo03forit;

import java.util.Arrays;

/**
 *
 * @author Ezequiel Bastos
 */
public class VetorExemplo03ForIt {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Esta estrutura e especifica para vetores em java 
        /*
        double v[] = {3.5, 2.75, 9, -4.3};
        for (double valor: v){
            System.out.print(valor + " ");
        }
        */
        
        //Colocando o vetor em ordem numerica
        
        double v[] = {3.5, 2.75, 9, -4.3};
        //A linha a baixo coloca o vetor em ordem!
        Arrays.sort(v);
        for (double valor: v){
            System.out.print(valor + " ");
        }
        
        
        
    }
    
}
