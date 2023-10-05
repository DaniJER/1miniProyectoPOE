package Ventana;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowPlayer extends JFrame{
    private String name, nombre;
    private JTextField cajaTexto;
    public JPanel panelPlayer;
    public void setNombre(String nombre){
        this.nombre = nombre;
    };
    public String getNombre(){
        return nombre;
    }
    //CREANDO LA VENTANA DONDE SE DIGITARA EL NOMBRE
    public WindowPlayer(){
        setSize(950,600); //Dimensiones de la ventana
        setLocationRelativeTo(null); //Establecer la ubicacion de la ventana en el centro de la pantalla
        setResizable(true); //Metodo para establecer si se redimensiona la ventana o no. el valor es booleano.
        //setMinimumSize(new Dimension(300,600)); En caso de que se quiera establecer un tamaño minimo para la ventana
        //setMaximumSize(new Dimension()); En caso de que se quiera establecer un tamaño maximo
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Se establece un Stop a la ventana, una vez se clickee en la X
        setTitle("FIGURAS :)"); // Establecer titulo para la ventana
        this.getContentPane() .setBackground(Color.white); //Obtener el contenido de la ventana y establecer un color a su background
        componentes();
    }
    private void componentes() {
        panelPlayer = new JPanel(); //Creacion del panel
        //panel.setBackground(Color.RGBtoHSB(6,6,6,10,)); //Establecer color para el panel
        panelPlayer.setLayout(null); // Desactivando el Layout
        this.add(panelPlayer); //Agregar el panel a la ventana

        ImageIcon circulo = new ImageIcon("circulo.png");
        JLabel figura2 = new JLabel(new ImageIcon("circulo.png")); //Creando el objeto figura.
        figura2.setBounds(300, 365, 250, 200);
        figura2.setIcon(new ImageIcon(circulo.getImage().getScaledInstance(figura2.getWidth(), figura2.getHeight(), Image.SCALE_SMOOTH)));
        figura2.setBackground(Color.CYAN);
        figura2.setVisible(true);
        panelPlayer.add(figura2);

        //ACTION PARA CLICKEAR Y EN EL BOTON CANCELAR Y VOLVER AL MENU PRINCIPAL
        ActionListener cancelar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Window ventanaInicial = new Window();
                ventanaInicial.setVisible(true);
            }
        };
        buttonCancel().addActionListener(cancelar);

        //ACTION PARA CLICKEAR EL BOTON ACEPTAR Y ENTRAR A LA VENTANA DEL JUEGO

        ActionListener aceptar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                name = cajaTexto.getText();
                GameWindow ventanaJuego = new GameWindow(name);
                ventanaJuego.jLabel();
                ventanaJuego.setVisible(true);

            }
        };
        buttonAcept().addActionListener(aceptar);
    }

    private JTextField obtenerNombre;
        public JLabel text () {
            JLabel texto = new JLabel();
            texto.setBounds(345, 185, 350, 40);
            texto.setFont(new Font("arial", 0, 35));
            texto.setText("Digite su nombre");
            texto.setForeground(Color.black);
            panelPlayer.add(texto);
            return texto;
        };

        public JTextField getTextPlayer () {
            cajaTexto = new JTextField();
            cajaTexto.setBounds(345, 265, 250, 40);
            cajaTexto.setFont(new Font("arial", 0, 30));
            cajaTexto.setBackground(Color.lightGray);
            panelPlayer.add(cajaTexto);
            return cajaTexto;
        };

        public JButton buttonAcept (){
            JButton buttonAcept = new JButton();
            buttonAcept.setText("Aceptar");
            buttonAcept.setBounds(345, 330, 110, 40);
            buttonAcept.setBackground(Color.lightGray);
            buttonAcept.setForeground(Color.BLACK);
            panelPlayer.add(buttonAcept);
            return buttonAcept;
        };

        public JButton buttonCancel (){
            JButton buttonCancel = new JButton();
            buttonCancel.setText("Cancelar");
            buttonCancel.setBounds(475, 330, 110, 40);
            buttonCancel.setBackground(Color.LIGHT_GRAY);
            buttonCancel.setForeground(Color.BLACK);
            panelPlayer.add(buttonCancel);
            return buttonCancel;

        };


};
