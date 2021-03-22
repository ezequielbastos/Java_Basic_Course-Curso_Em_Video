package tiposprimitivosjava;

/** 
 * @author Ezequiel Bastos
 * @version 1.0
 * @since 2021-02-24
 */

public class TiposPrimitivosJava {

    public static void main(String[] args) {
    
        //Metodo normal de DECLARAÇÃO!
        int idade = 18;
        float sal = 1825.54f;
        char letra = 'G';
        boolean casado = false;
        
            //Saida de dados da declarações acima!
            System.out.println("----------------------");
            System.out.println("A idade é: " + idade);
            System.out.println("O Salario é: " + sal);
            System.out.println("A Letra é: " + letra);
            System.out.println("É casado?: " + casado);
            System.out.println("----------------------");
            
           /* Formatando saida de dados com PrintF, %.2f o 2 e a quantidade de 
            * casas decimais! 
            * Repare que o comando de saida muda para " System.out.printf " por 
            * isso perdemos a quebra de linhas basta usar o "\n" 
            */
            float nota = 9.5f;
            System.out.printf("Sua Nota é: %.2f \n\n", nota);
            
            //Também podemos usar o PrintF para formatar String.
            String nome = "Zack";
            System.out.printf("Á nota de %s é: %.2f \n\n",nome ,nota);
            
            //Utilizando o metodo format, so muda o nome o resultado é o msm!
            System.out.println("Mostrando Resutado com metodo Format");
            System.out.format("Á nota de %s é: %.2f \n\n",nome ,nota);
        //----------------------------------------------------------------------
        
        //Metodo de DECLRAÇÂO com Typecast
        int idade2 = (int) 20;
        float sal2 = (float) 2100.70;
        char letra2 = (char) 'L';
        boolean casado2 = (boolean) true;
            
            //Saida de dados da declarações acima!
            System.out.println("----------------------");
            System.out.println("A idade é: " + idade2);
            System.out.println("O Salario é: " + sal2);
            System.out.println("A Letra é: " + letra2);
            System.out.println("É casado?: " + casado2);
            System.out.println("----------------------");
            
            //Formatando saida com Format
            System.out.format("O salario é: %.2f \n\n",sal2);
        //----------------------------------------------------------------------
        
        //Metodo de DECLARAÇÂO com Wrapper Class
        Integer idade3 = 15;
        Float sal3 = new Float(1500);
        Character letra3 = 'G';
        Boolean casado3 = false;
        //Para nomes maiores usamos a Classe String ex:
        String nome2 = "Izack";
            
            //Saida de dados da declarações acima!
            System.out.println("----------------------");
            System.out.println("A idade é: " + idade3);
            System.out.println("O Salario é: " + sal3);
            System.out.println("A Letra é: " + letra3);
            System.out.println("É casado?: " + casado3);
            System.out.println("O nome é: " + nome2);
            System.out.println("----------------------");
            
            //Utilizando o metodo format!
            System.out.format("O salario de %s é: %.2f \n\n",nome2 ,sal3);
        //----------------------------------------------------------------------
    }
}