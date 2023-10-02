package Ventana;

import javax.swing.*;
import java.awt.*;

public class ConfigGame extends JFrame {
    public JPanel panel;
    public ConfigGame(){
        setSize(950,600); //Dimensiones de la ventana
        setLocationRelativeTo(null); //Establecer la ubicacion de la ventana en el centro de la pantalla
        setResizable(true); //Metodo para establecer si se redimensiona la ventana o no. el valor es booleano.
        //setMinimumSize(new Dimension(300,600)); En caso de que se quiera establecer un tamaño minimo para la ventana
        //setMaximumSize(new Dimension()); En caso de que se quiera establecer un tamaño maximo
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Se establece un Stop a la ventana, una vez se haga click en la X
        setTitle("FIGURAS :)"); // Establecer titulo para la ventana
        this.getContentPane() .setBackground(Color.gray); //Obtener el contenido de la ventana y establecer un color a su background
        iniciarVentana();
    }

    private void iniciarVentana() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    public JLabel showInstructions(){
        JLabel texto = new JLabel();
        texto.setOpaque(true);
        texto.setText("Hola perras");
        texto.setBounds(200,-220,950,600);
        texto.setBackground(Color.white);
        panel.add(texto);
        return texto;
    }
}

