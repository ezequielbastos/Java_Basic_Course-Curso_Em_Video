
package testefuncao;

/**
 *
 * @author Ezequiel Bastos
 */
public class TesteFuncao {
    /* metodos com o nome void inserido funcionam como os procedimentos não 
    retornando valores para o programa pricipal. 
    No coso do java metodo principal*/
    
    /* para podermos chamar o metodo soma temos que conveter ele para statico 
    acrecentando a palavra static antes do void */
    
    //Metodo sem retorno - Procedimento
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("Usando procedimentos para somar numeros");
        System.out.println("A = " + a + " B = " + b + " Resultado = " + s);
    }

    /*  Para indicar as funções usamos o tipo primitivo de variavel para indicar 
    o retorno da função para o metodo principal*/
    
    // Metodo com retorno - Função
    static int soma2(int a, int b){
       int s = a + b;
       return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o algortmo");
        //chamando o procedimento
        soma(5,2);
        
        //atribuindo valores nas variaveis globais para serem passado para a função
        int a = 8, b = 6;
        
        //chamando a função
        int sm = soma2(a,b);
        
        //Mostrando o resultado obitido no retorno ao metodo principal na variavel sm
        System.out.println("Usando Funções para somar numeros");
        System.out.println("A = " + a + " B = " + b + " Resultado = " + sm);
    }
    
}
