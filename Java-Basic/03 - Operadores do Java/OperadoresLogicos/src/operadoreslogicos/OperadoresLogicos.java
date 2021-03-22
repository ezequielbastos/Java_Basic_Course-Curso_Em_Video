package operadoreslogicos;

/**
 *
 * @author Ezequiel Bastos
 */
public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        // Utilizando os Operadores Logicos && || ^ !
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean res1, res2, res;
        
        //Utilizando (E) - &&
        res1 = (x<y && y<z);
        System.out.println("Res1 = " + res1);
        System.out.println("Res2 = " + (x<y && z<y));
        
        //Utilizando (ou) - ||
        res1 = (x<y || y>z);
        System.out.println("Res3 = " + res1);
        System.out.println("Res4 = " + (x>y || y>z));
        
        //Utilizando o (^) - XOU -> true ^ true = false
        res1 = (x<y ^ y>z);
        System.out.println("Res5 = " + res1);
        System.out.println("Res6 = " + (x>y ^ y>z));
        
        //Utilizando o (!) - NÃO -> ! false = true
    }
    
}
