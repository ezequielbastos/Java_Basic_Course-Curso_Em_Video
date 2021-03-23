package exerciciorepita03;

import javax.swing.JOptionPane;


/**
 *
 * @author Ezequiel Bastos
 */
public class ExercicioRepita03 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Pegando informações do teclado
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);

        int n, soma = 0, par = 0, impar = 0, acimaDe100 = 0, menorDe100 = 0, loops = 0;
        do{
           n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                   "<html>Informe um número: <br><em>(Valor 0 imterrompe)</em></html>"));
           soma += n;
           loops++;
                if (n % 2 == 0){
                    par++;
                }else if(n % 2 == 1){
                    impar++;
                }
                
                if (n <= 100){
                    menorDe100++;
                }else if(n > 100){
                    acimaDe100++;
                }       
        }while(n != 0);
        System.out.println("V loops: " + loops);
        loops--;
        System.out.println("V loops: " + loops);
        float mDia = soma / loops;
        JOptionPane.showMessageDialog(null,"<html>Resultado final <hr> "
                + "<br> Total dos Nº: " + loops
                + "<br> Somatório dos Nº: " + soma 
                + "<br> Total de Nº Pares: " + par
                + "<br> Total de Nº Impares: " + impar
                + "<br> Total de Nº Acima de 100: " + acimaDe100
                + "<br> Total de Nº Abaixo de 100: " + menorDe100
                + "<br> Média Total dos valores SOMADOS: " + mDia
                + "</html>", "Resultado Final", JOptionPane.WARNING_MESSAGE);
        
    }
    
}
