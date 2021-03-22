package operadoresrelacionais;

/**
 *
 * @author Ezequiel Bastos
 */
public class OperadoresRelacionais {

    public static void main(String[] args) {
        
        // Operadores Relacionais
        
        // ( > ) Maior que
        boolean valor = 5 > 2; 
        System.out.println("(5 > 2) = " + valor);
        
        // ( < ) Menor que
        boolean valor2 = 1 > 4; 
        System.out.println("(1 < 4) = " + valor2);
        
        // ( >= ) Maior ou igual a
        boolean valor3 = 8 >= 3; 
        System.out.println("(8 >= 3) = " + valor3);
        
        // ( =< ) Menor ou igual a
        boolean valor4 = 6 <= 6; 
        System.out.println("(6 <= 6) = " + valor4);
        
        // ( == ) Igual a
        boolean valor5 = 9 == 6; 
        System.out.println("(9 == 6) = " + valor5);
        
        // ( != ) Diferente de
        boolean valor6 = 9 != 6; 
        System.out.println("(9 != 6) = " + valor6);
        
        //Comparação entre Strings
        String nome1 = "Izack";
        String nome2 = "Izack";
        String nome3 = new String("Izack");
        
        boolean res = (nome1 == nome2);
        System.out.println("Nome1 == Nome2: " + res);
        boolean res2 = (nome1 != nome2);
        System.out.println("Nome1 != Nome2: " + res2);
        
        //No caso nome3 ele foi istanciado como um objeto e o outros nome 1 e 2 fazem parte de uma Classe!
        boolean res3 = (nome1 == nome3); //Era pra ser true mas ele retorna false
        System.out.println("Nome1 == Nome3: " + res3);
        //Para resolver temos que usar o equals para comparar
        boolean res4 = (nome1.equals(nome3));
        System.out.println("Nome1 == Nome3: " + res4);
    }
    
}
