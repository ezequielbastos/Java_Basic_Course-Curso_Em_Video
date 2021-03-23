package repeticaofor;

/**
 *
 * @author Ezequiel Bastos
 */
public class RepeticaoFor {

    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        int cc=0;
        while (cc<4){
            System.out.println(cc);
            cc++;
        }
        */
        
        //Simplificando com o FOR
        
        //De 1 a 10
        /*
        for (int cc=1; cc<=10; cc++){
            System.out.println(cc);
        }
        */
        
        //De 10 a 0
        /*
        for (int cc=10; cc>=0; cc--){
            System.out.println(cc);
        }
        */
        
        //De 10 a 0 diminundo por 2
        /*
        for (int cc=10; cc>=0; cc-=2){
            System.out.println(cc);
        }
        */
        
        //De 0 a 100 pulando em 10 em 10
        for (int cc=0; cc<=100; cc+=10){
            System.out.println(cc);
        }
    }
    
}
