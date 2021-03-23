package projetofuncao;

/**
 *
 * @author Ezequiel Bastos
 */
public class ProjetoFuncao {
    
    public static void main(String[] args) {
        // Criando um objeto da clase Fatorial
        Fatorial f = new Fatorial();
        
        //Inserindo o valor a ser Fatorado pelo metodo setValor que criamos na class Fatorial
        f.setValor(6);
        
        //Pegando os valores computados pelo metodo setValaor
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
    }

    
    
}
