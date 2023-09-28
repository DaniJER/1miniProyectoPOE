package Ventana;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Ventana extends JFrame { //La clase ventana hereda atributos de la clase JFrame
    public Ventana(){
        setSize(950,600); //Dimensiones de la ventana
        setLocationRelativeTo(null); //Establecer la ubicacion de la ventana en el centro de la pantalla
        setResizable(true); //Metodo para establecer si se redimensiona la ventana o no. el valor es booleano.
        //setMinimumSize(new Dimension(300,600)); En caso de que se quiera establecer un tamaño minimo para la ventana
        //setMaximumSize(new Dimension()); En caso de que se quiera establecer un tamaño maximo
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Se establece un Stop a la ventana, una vez se clickee en la X
        setTitle("FIGURAS :)"); // Establecer titulo para la ventana
        this.getContentPane() .setBackground(Color.gray); //Obtener el contenido de la ventana y establecer un color a su background
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        JPanel panel = new JPanel(); //Creacion del panel

        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }
}
