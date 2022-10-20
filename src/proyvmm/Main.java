/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyvmm;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        frmVentanaPrincipal x=new frmVentanaPrincipal();//constructor
        x.setLocationRelativeTo(null);//centra la ventana
        x.setDefaultCloseOperation(frmVentanaPrincipal.EXIT_ON_CLOSE);//para acabar proceso cuando se cierre la ventana desde la x
        x.setResizable(false);//para que no se pueda modificar el tamaño de la ventana
        x.setVisible(true);//hace visible la interfaz
    }*/
    
    public static void main(String[] args) {
        frmContenido x=new frmContenido();//constructor
        x.setLocationRelativeTo(null);//centra la ventana
        x.setDefaultCloseOperation(frmContenido.EXIT_ON_CLOSE);//para acabar proceso cuando se cierre la ventana desde la x
        x.setResizable(false);//para que no se pueda modificar el tamaño de la ventana
        x.setVisible(true);//hace visible la interfaz
    }
}
