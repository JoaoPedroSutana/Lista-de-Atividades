//Autores: Caio Moreira Cancela e João Pedro Furiati Sutana
package gestãodebibliotecas;

import Base.Biblioteca;

public class Principal {
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            Biblioteca biblioteca = new Biblioteca();
            new FormPrincipal(biblioteca).setVisible(true);
        });
    }  
}
