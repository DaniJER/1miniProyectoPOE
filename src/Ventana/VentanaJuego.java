package Ventana;

import javax.swing.*;
import java.awt.*;

public class VentanaJuego extends JFrame {
    private String name;
    private String prueba = "esto es una prueba";
    public JPanel panelGame;

    //CREANDO LA VENTANA Y SUS DIMENSIONES
    public VentanaJuego(String name) {
        this.name = name;
        setSize(950, 600); //Dimensiones de la ventana
        setLocationRelativeTo(null); //Establecer la ubicacion de la ventana en el centro de la pantalla
        setResizable(true); //Metodo para establecer si se redimensiona la ventana o no. el valor es booleano.
        //setMinimumSize(new Dimension(300,600)); En caso de que se quiera establecer un tamaño minimo para la ventana
        //setMaximumSize(new Dimension()); En caso de que se quiera establecer un tamaño maximo
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Se establece un Stop a la ventana, una vez se clickee en la X
        setTitle("FIGURAS :)"); // Establecer titulo para la ventana
        this.getContentPane().setBackground(Color.white); //Obtener el contenido de la ventana y establecer un color a su background
        iniciarComponentes(); // Llamo al metodo iniciar componentes para que el panel haga parte de la ventana
    }
    private void iniciarComponentes() {
        panelGame = new JPanel(); //Creacion del panel
        //panel.setBackground(Color.RGBtoHSB(6,6,6,10,)); //Establecer color para el panel
        panelGame.setLayout(null); // Desactivando el Layout
        this.add(panelGame); //Agregar el panel a la ventana
    }

    public JLabel jLabel () {
            JLabel namePlayer = new JLabel(name);
            namePlayer.setBounds(200, 200, 380, 50);
            namePlayer.setFont(new Font("arial", 0, 25));
            //namePlayer.setText(name);
            namePlayer.setForeground(Color.black);
            panelGame.add(namePlayer);
            return namePlayer;
        }

}
