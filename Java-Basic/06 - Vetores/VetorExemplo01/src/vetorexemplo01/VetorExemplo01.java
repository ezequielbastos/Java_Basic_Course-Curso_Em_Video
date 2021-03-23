package vetorexemplo01;

/**
 *
 * @author Ezequiel Bastos
 */
public class VetorExemplo01 {
    
    public static void main(String[] args) {
        
        //Criando um Vetor e atribuindo a valores diretamente nele
        int n[] = {3,5,8,7,6,3};
        
        //Mostrando os valores no console
        /*
        for(int c=0; c<=5; c++){
            System.out.println("Numero da posição [" + c + "] = " + n[c]);
        }
        */
        
        //Mostrando a quantidade de casas de um vetor com o metodo .length
        //System.out.println("Total de casas do Vetor N = " + n.length);
        
        //Usando o metodo para deixar o For mais utilizavel em outros programas
        for(int c=0; c<=n.length-1; c++){
            System.out.println("Numero da posição [" + c + "] = " + n[c]);
        }
    }
    
}
