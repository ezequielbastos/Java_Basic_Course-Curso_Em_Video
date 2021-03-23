package testefuncao02;

/**
 *
 * @author Ezequiel Bastos
 */

/*
 *  Utilizando multiplas classes para no algoritimo atraves de estaciamento de 
 *  metodos!
 */
public class TesteFuncao02 {
    
    //O static indica a possibilidade de se usar o metodo sem precisar tranformaló em um objeto.
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vai começar a contagem");
        System.out.println(Operacoes.contador(1,6));
    }
    
}
