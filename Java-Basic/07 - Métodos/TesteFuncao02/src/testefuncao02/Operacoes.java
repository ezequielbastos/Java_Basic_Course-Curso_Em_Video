
package testefuncao02;

/**
 *
 * @author Ezequiel Bastos
 */
public class Operacoes {
   /* para podermos usamos este metodo em outra classe precisamos declara sua 
    visibilidade como publica e statica */
    public static String contador(int i, int f){
        String s = "";
        for (int c = i; c <= f; c++){
            s += c + " ";
        }
        return s;
    }
}
