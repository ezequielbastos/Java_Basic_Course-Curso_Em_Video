package operadoresdeatribuicao;

/**
 *
 * @author Ezequiel Bastos
 */
public class OperadoresDeAtribuicao {
    
    public static void main(String[] args) {
        
       int x = 6;
       
       //O java fornece atribuidores simplificados para diminuir o codigo!
       //Neste ex o 6 esta recebendo ele mesmo e fazendo a operação em seguida!
       x += 2; // x = x + 2 
       System.out.println("x += 2 = " + x);
       x -= 2; // x = x - 2
       System.out.println("x -= 2 = " + x);
       x *= 2; // x = x * 2
       System.out.println("x *= 2 = " + x);
       x /= 2; // x = x / 2
       System.out.println("x /= 2 = " + x);
       x %= 2; // x = x % 2
       System.out.println("x %= 2 = " + x);
    }
    
}
