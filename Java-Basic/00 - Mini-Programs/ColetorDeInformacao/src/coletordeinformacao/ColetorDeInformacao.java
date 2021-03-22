package coletordeinformacao;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Ezequiel Bastos
 */
public class ColetorDeInformacao {
    public static void main(String[] args) {
        
        //Mostra a Data e Hora do Sistema
        Date relogio = new Date();
        System.out.println("Á Hora e Data do sistema é: " + relogio.toString());
        
        //Mostra o Idioma do Sistema
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é: " + idioma.getDisplayLanguage());
        
        //Mostra as Dimensões do Monitor
        Toolkit dimen = Toolkit.getDefaultToolkit();
        Dimension d = dimen.getScreenSize();
        System.out.println("A resolução do monitor é: " + d.width + " X " + d.height);
    }
}
