package Ventana;

import javax.swing.*;

public class Ventana extends JFrame { //La clase ventana hereda atributos de la clase JFrame
    public Ventana(){
        setSize(500,500); //Dimensiones de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Se establece un Stop a la ventana, una vez se clickee en la X
        setTitle("Ventana de Juego"); // Establecer titulo para la ventana
    }
}
