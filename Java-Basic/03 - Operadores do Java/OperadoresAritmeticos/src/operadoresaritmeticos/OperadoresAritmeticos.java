package operadoresaritmeticos;

/**
 *
 * @author Ezequiel Bastos
 */
public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        int n1 = 8;
        int n2 = 2;
        
        int result1 = n1 + n2;
        int result2 = n1 - n2; 
        int result3 = n1 * n2;
        int result4 = n1 / n2;
        int result5 = n1 % n2;
        
        System.out.println(n1 + " + " + n2 + " = "+ result1);
        System.out.println(n1 + " - " + n2 + " = "+ result2);
        System.out.println(n1 + " * " + n2 + " = "+ result3);
        System.out.println(n1 + " / " + n2 + " = "+ result4);
        System.out.println(n1 + " % " + n2 + " = "+ result5);
        
        //Ordem de precendencia de uma operação funciona com base nas regras gerais da matematica!
        int result6 = (n1 + n2)/2;
        System.out.println("(" + n1 +")" + " + " + "(" + n2 + ")/2" + " = "+ result6);
    }
    
}
