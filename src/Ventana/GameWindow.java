// creators: Juan Viedman 2242562 - Daniel Enriquez 2240920
package Ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private String name;
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
        iniciarComponentesJuego(); // Llamo al metodo iniciar componentes para que el panel haga parte de la ventana
    }
    private void iniciarComponentesJuego() {
        panelGame = new JPanel(); //Creacion del panel
        panelGame.setLayout(null); // Desactivando el Layout
        this.add(panelGame); //Agregar el panel a la ventana

       
        //AGREGANDO LINEA QUE SEPERA LA FIGURA CORRECTA DE LAS DEMAS OPCIONESS
        ImageIcon triangulo = new ImageIcon("linea2.png");
        JLabel figura1 = new JLabel(new ImageIcon("linea2.png")); //Creando el objeto figura.
        figura1.setBounds(100,-20,260,600);
        figura1.setIcon(new ImageIcon(triangulo.getImage().getScaledInstance(figura1.getWidth(),figura1.getHeight(), Image.SCALE_SMOOTH)));
        panelGame.add(figura1);

        ActionListener exitButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Statistics exit = new Statistics();
                exit.totalFiguresShown();
                exit.setVisible(true);
            }
        };
        exitButton().addActionListener(exitButton);
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
        }

        // Button to end the game
        public JButton exitButton() {
            JButton exitButton = new JButton("Finalizar");
            //exitButton.setHorizontalAlignment(SwingConstants.CENTER);
            exitButton.setBounds(455,100,220,40); //ubicacion y tamano del boton "instrucciones"
            exitButton.setForeground(Color.white); //Establecer color de la letra
            exitButton.setFont(new Font("arial",0,30)); //Asignar
            exitButton.setOpaque(true);
            exitButton.setBackground(Color.black);
            panelGame.add(exitButton);
            return exitButton;
        }
}
