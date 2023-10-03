package Ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import javax.imageio.ImageIO;

public class VentanaJuego extends JFrame {
    private String name;

    private BufferedImage[] imagenes = new BufferedImage[4];
    public void setImagenes(BufferedImage[] imagenes){
        this.imagenes = imagenes;
    };
    public BufferedImage[] getImagenes(){
      return imagenes;
    };

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
            namePlayer.setBounds(100, 10, 380, 50);
            namePlayer.setFont(new Font("arial", 0, 25));
            //namePlayer.setText(name);
            namePlayer.setForeground(Color.black);
            namePlayer.setText("Jugador: "+ name);
            panelGame.add(namePlayer);
            return namePlayer;
        }
    //Rutas de imagenes
    String[] rutas = {
            "circulo.png",
            "cuadrado.png",
            "rectangulo.png",
            "triangulo.png"
    };




    //FIGURAS EN EL JUEGO
    ImageIcon circulo = new ImageIcon("circulo.png");
    JLabel circulo1 = new JLabel(new ImageIcon("circulo.png"));


    ImageIcon rectangulo = new ImageIcon("rectangulo.png");
    JLabel rectangulo1 = new JLabel(new ImageIcon("rectangulo.png"));

    ImageIcon triangulo = new ImageIcon("triangulo.png");
    JLabel triangulo1 = new JLabel(new ImageIcon("triangulo.png"));

    ImageIcon cuadrado = new ImageIcon("cuadrado.png");
    JLabel cuadrado1 = new JLabel(new ImageIcon("cuadrado.png"));




}
