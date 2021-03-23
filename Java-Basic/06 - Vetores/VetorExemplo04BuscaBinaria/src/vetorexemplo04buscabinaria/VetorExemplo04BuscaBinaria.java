package vetorexemplo04buscabinaria;

import java.util.Arrays;

/**
 *
 * @author Ezequiel Bastos
 */
public class VetorExemplo04BuscaBinaria {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Utilizando o metodo .binarySearch() da clase Array para fazer busca em vetores
        
        int veti[] = {3, 7, 6, 9, 1, 4, 2};
        //Utilizando ForIt
        for (int val: veti){
            System.out.print(val + " "); 
        }
        System.out.println("");
        int p = Arrays.binarySearch(veti, 9);
        System.out.println("Encontrei o valor na posição " + p);
    }
    
}
