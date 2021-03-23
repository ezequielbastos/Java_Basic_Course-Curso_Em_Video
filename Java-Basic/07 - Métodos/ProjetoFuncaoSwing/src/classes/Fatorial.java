package classes;

/**
 *
 * @author Ezequiel Bastos
 */
public class Fatorial {
    
    //Declaração dos atributos
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    //Contruindo o metodo que vai calcular o fatorial e setar nos atributos
    public void setValor(int n){
        num = n;
        int f = 1;
        String s = "";
        for(int c = n; c > 1; c--){
            f *=c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    //metodo que vai pegar o resultado do fatorial 
    public int getFatorial(){
        return fat;
    }
    
    //metodo que vai pegar a formula
    public String getFormula(){
        return formula;
    }
}
