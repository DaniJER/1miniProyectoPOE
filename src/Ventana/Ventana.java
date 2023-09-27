package Ventana;

import javax.swing.*;

public class Ventana extends JFrame { //La clase ventana hereda atributos de la clase JFrame
    public Ventana(){
        setSize(850,600); //Dimensiones de la ventana
        setLocationRelativeTo(null); //Establecer la ubicacion de la ventana en el centro de la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Se establece un Stop a la ventana, una vez se clickee en la X
        setTitle("FIGURAS :)"); // Establecer titulo para la ventana

    }
}
