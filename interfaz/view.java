import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class view here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class view
{
    public static void main(String args[]){
        //creamos ventana
        JFrame view = new JFrame("Ventana con componentes");
        view.setLayout(new FlowLayout());
        view.setSize(700,500);
        
        //creamos boton
        JButton button = new JButton("Pulsar");
        view.add(button);
        
        button.addActionListener(e->{
           System.out.println("Hola Mundo"); 
        });
        
        view.setVisible(true);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}