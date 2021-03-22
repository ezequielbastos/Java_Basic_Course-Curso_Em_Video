package operadoresclassmath;

/**
 *
 * @author Ezequiel Bastos
 */

public class OperadoresClassMath {
    
    public static void main(String[] args) {
        
        /*
        //Usando Math.PI
        double raio = 2;
        double valPi = Math.PI; //usa-se double sempre que o valor em Reais for muito grande
        System.out.println("O valor de PI é: " + valPi);
        
        //Calculando a circuferencia de um circulo com PI
        double val = 2*raio*Math.PI;
        System.out.println("O comprimento do circulo é: " + val);
        System.out.println("O comprimento do circulo é: " + 2*raio*Math.PI);
        
        //Vamos supor que queremos saber a quantidades de voltas que uma pessoa percorreu!
        System.out.println("Vc percorreu: "+ 2*raio*Math.PI + " metros");
        int voltas = (int) ((2*raio*Math.PI)*4); //Usando TypeCast para converter double para int!
        System.out.println("Vc percorreu: "+ voltas + " metros"); //mostrando so os metros!
        
        //Para mostrar os metros e centimentros arrendondados!
        double voltas2 = ((2*raio*Math.PI)*4);
        System.out.printf("Vc percorreu: %.2f metros \n", voltas2);
        System.out.println("\n");
        */
        
        //----------------------------------------------------------------------
        
        /*
        //Usando Math.pow para fazer exponenciações
        int ex = (int) Math.pow(5,2); //convertendo pois este metodo esta em double!
        System.out.println("A exponenciação de 5^2 = "+ ex);
        //exemplo 2
        System.out.println("A exponenciação de 3^2 = "+ Math.pow(3,2));
        //exemplo 3 usando variaveis
        int n1 = 9;
        int n2 = 2;
        System.out.println("A exponenciação de 9^2 = "+ Math.pow(n1,n2));
        */
        
        //----------------------------------------------------------------------
        
        /*
        //Usando Math.sqrt para calcular a Raiz de Numeros
        int raiz = 3; 
        //quando se tem um valor int e vc quer passa-ló para uma variavel float tem que fazer a conversão!
        float val3 = (float) Math.sqrt(raiz); //quando a variavel que for receber for float tem que converter usando TypeCast
        System.out.println("A Raiz Quadrada de " + raiz + " é: " + val3); 
        //Outra maneira de se calcular
        double val4 = Math.sqrt(raiz); //quando usado double não precisa converter!
        System.out.println("A Raiz Quadrada de " + raiz + " é: " + Math.sqrt(raiz));
        */
        
        //----------------------------------------------------------------------
        
        /*
        //Usando Math.cbrt para calcular a Raiz Cubica de Numeros
        int raiz = 3; 
        //quando se tem um valor int e vc quer passa-ló para uma variavel float tem que fazer a conversão!
        float val3 = (float) Math.cbrt(raiz); //quando a variavel que for receber for float tem que converter usando TypeCast
        System.out.println("A Raiz Cubica de " + raiz + " é: " + val3); 
        //Outra maneira de se calcular
        double val4 = Math.cbrt(raiz); //quando usado double não precisa converter!
        System.out.println("A Raiz Cubica de " + raiz + " é: " + Math.cbrt(raiz));
        */ 
        
        //----------------------------------------------------------------------
        //          Metodos de Arredondamentos da Classe Math
        //----------------------------------------------------------------------
        
        /*
        //Valor Absoluto - Math.abs(-10) = 10
        int valAbs = -10; 
        int abs = Math.abs(valAbs); //Neste caso não precisamos converter pois o metodo Math.abs trabalha apenas com Inteiros
        System.out.println("O valor Absoluto de "+ valAbs + " é: " + abs);
        
        //Arredondamento para Baixo - Math.floor(3.9) = 3
        double valArreB = 3.9;
        double ArreB = Math.floor(valArreB);
        System.out.println("O arredondamento de "+ valArreB + " é: " + ArreB);
        
        //Arredondamento para Cima - Math.ceil(4.2) = 5
        double valArreC = 4.2;
        double ArreC = Math.ceil(valArreC);
        System.out.println("O arredondamento de "+ valArreC + " é: " + ArreC);
        
        //Arredondamento Aritmetico - Math.round(5.6) = 6.0
        //Arredondamento Aritmetico - Math.round(5.5) = 5.0 
        double valArreA = 5.9;
        double ArreA = Math.round(valArreA);
        System.out.println("O arredondamento de "+ valArreA + " é: " + ArreA);
        */
        
        //----------------------------------------------------------------------
        //        Metodo que gera numeros aleatorios com a Classe Math
        //----------------------------------------------------------------------
        
        /*
        //Gerando numeros Aleatorios com Math.random()
        //Ele gera numeros reais de 0.0 a 1.0
        double ale = Math.random();
        System.out.println(ale);
        //Para fazer com que ele gere numeros tipo de 1 a 10 temos que fazer o seguinte calculo!
        int numeroAleInt = (int) (1 + ale * (10-1));
        System.out.println("N-Aleatorio: "+ numeroAleInt);
        //Para gerar numeros Reais basta fazer o seguinte
        double numeroAleDouble = (1 + ale * (10-1));
        System.out.printf("N-Aleatorio: %.2f \n", numeroAleDouble);
        */
    }  
    
}
