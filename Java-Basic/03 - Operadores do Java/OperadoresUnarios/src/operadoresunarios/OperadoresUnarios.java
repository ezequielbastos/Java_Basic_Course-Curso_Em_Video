package operadoresunarios;

/**
 *
 * @author Ezequiel Bastos
 */
public class OperadoresUnarios {
    
    public static void main(String[] args) {
        
        //Operadores Unarios    ++ e --
        int num1 = 7;
        
        num1++;
        System.out.println("Imcrementado com ++ = " + num1);
        num1--;
        System.out.println("Decrementado com -- = " + num1);
        
        //Difereça entre ++ ou -- na frente ou atraz! 
        int num = 5;
        
        /* Neste caso esta linha vai fazer todas as operações e dps somar +1 na 
        variavel num! Ex: 5 + num = 10 ao ives de somar +1 com 10 para a variavel
        valor receber 11 ele vai fazer o que vc mandou somar +1 no num que ficara 6*/
        int valor = 5 + num++;
        System.out.println("Resultado da Operação: " + valor);
        //Depois que é feito a operação 5 + num, ocorre o imcremento num++ passa a ser 6
        System.out.println("Num Pós=Imcremento = " + num);
        
        /*  Para resolver isto basta trocar o ++ no final da variavel para o começo dela
        Ex: 5 + ++num = 11 Neste caso á um pré-imcremento, vc diz pra linha que quer
        que a variavel num2 receba +1 antes que a operação comece! 
        */
         int num2 = 5;
         int valor2 = 5 + ++num2;
         System.out.println("Resultado da Operação: " + valor2);
         System.out.println("Num2 Pré-Imcremento: " + num2);
         
         //Exemplo mostrando em uma Saida de dados
        System.out.println("Exemplo de Pós-Imcremento = " + valor++); //Soma +1 depois que msg aparece
        System.out.println("Pós-Imcremento = " + valor); //mostrando valor com +1 somados
        System.out.println("Exemplo de Pré-Imcremento = " + ++valor); //Soma +1 antes de mostrar a msg
        
        // Para diminuir e so fazer o msm com -- utilizando pre ou pos Decremento
        System.out.println("\n\n------------------------------");
        int decre = 4;
        System.out.println("Resultado Pós-Decremento = " + (10 - decre--));
        System.out.println("Pós-Decremento = " + decre);
        System.out.println("Resultado Pré-Decremento = " + (10 - --decre)); 
    }
    
}
