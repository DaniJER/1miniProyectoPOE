package Ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameWindow extends JFrame {
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
    public GameWindow(String name) {
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
        panelGame.setLayout(null); // Desactivando el Layout
        this.add(panelGame); //Agregar el panel a la ventana

        ImageIcon linea = new ImageIcon("Images/linea2.png");
        JLabel lineaEnJuego = new JLabel(new ImageIcon("Images/linea2.png"));
        lineaEnJuego.setBounds(150,150,200,100);
        lineaEnJuego.setBackground(Color.BLACK);
        lineaEnJuego.setIcon(new ImageIcon(linea.getImage().getScaledInstance(lineaEnJuego.getWidth(),lineaEnJuego.getHeight(), Image.SCALE_SMOOTH)));
        panelGame.add(lineaEnJuego);


    }
    //LABEL PARA MOSTRAR EL NOMBRE DEL JUGADOR EN LA VENTANA DEL JUEGO
    public JLabel playerName () {
            JLabel showName = new JLabel(name);
            showName.setBounds(500, 10, 380, 50);
            showName.setFont(new Font("arial", 0, 25));
            showName.setForeground(Color.black);
            showName.setText("Jugador: "+ name);
            panelGame.add(showName);
            return showName;
        }

     //LABEL PARA MOSTRAR LOS ACIERTOS DEL JUGADOR (FALTA LA LOGICA)   
     public JLabel showScore () {
            JLabel showScore1 = new JLabel(name);
            showScore1.setBounds(550, 520, 380, 50);
            showScore1.setFont(new Font("arial", 0, 25));
            showScore1.setForeground(Color.black);
            showScore1.setText("Aciertos: "+ "02");
            panelGame.add(showScore1);
            return showScore1;
        }

        public JLabel showFailures () {
            JLabel showFailures1 = new JLabel(name);
            showFailures1.setBounds(730, 520, 380, 50);
            showFailures1.setFont(new Font("arial", 0, 25));
            showFailures1.setForeground(Color.black);
            showFailures1.setText("Fallos: "+ "02");
            panelGame.add(showFailures1);
            return showFailures1;
        };
    
};
