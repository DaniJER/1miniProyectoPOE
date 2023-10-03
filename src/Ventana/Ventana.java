package Ventana;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame { //La clase ventana hereda atributos de la clase JFrame
    public JPanel panel;
    //CREANDO LA VENTANA Y SUS DIMENSIONES
    public Ventana(){
        setSize(950,600); //Dimensiones de la ventana
        setLocationRelativeTo(null); //Establecer la ubicacion de la ventana en el centro de la pantalla
        setResizable(true); //Metodo para establecer si se redimensiona la ventana o no. el valor es booleano.
        //setMinimumSize(new Dimension(300,600)); En caso de que se quiera establecer un tamaño minimo para la ventana
        //setMaximumSize(new Dimension()); En caso de que se quiera establecer un tamaño maximo
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Se establece un Stop a la ventana, una vez se haga click en la X
        setTitle("FIGURAS :)"); // Establecer titulo para la ventana
        this.getContentPane() .setBackground(Color.white); //Obtener el contenido de la ventana y establecer un color a su background
        iniciarComponentes();
    }
    //CREANDO EL JPANEL PARA UBICAR TODOS LOS COMPONENTES
    private void iniciarComponentes(){
        panel = new JPanel(); //Creacion del panel
        //panel.setBackground(Color.RGBtoHSB(6,6,6,10,)); //Establecer color para el panel
        panel.setLayout(null); // Desactivando el Layout
        this.add(panel); //Agregar el panel a la ventana

        //CREANDO EL BOTON DE JUGAR E INSTRUCCIONES
        //JUGAR
        JButton botonPlay = new JButton("Jugar");//Crear el boton de jugar
        botonPlay.setHorizontalAlignment(SwingConstants.CENTER);
        botonPlay.setBounds(405,200,130,40); //ubicacion y tamano del boton "jugar"
        botonPlay.setForeground(Color.white); //Establecer color de la letra
        botonPlay.setFont(new Font("arial",0,30)); //Asignar
        botonPlay.setOpaque(true);
        botonPlay.setBackground(Color.black);
        panel.add(botonPlay);// Se agrega el boton "jugar al panel"botonPlay.addActionListener(new ActionListener()

        // ACTIONLISTENER
        ActionListener jugar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                VentanaPlayer juego = new VentanaPlayer();
                juego.text();
                juego.buttonAcept();
                juego.buttonCancel();
                juego.getTextPlayer();
                juego.setVisible(true);

            }
        };
        botonPlay.addActionListener(jugar);

        //INSTRUCCIONES
        JButton botonInstrucc = new JButton("Instrucciones");//Crear el boton de instrucciones
        botonInstrucc.setHorizontalAlignment(SwingConstants.CENTER);
        botonInstrucc.setBounds(365,250,220,40); //ubicacion y tamano del boton "instrucciones"
        botonInstrucc.setForeground(Color.white); //Establecer color de la letra
        botonInstrucc.setFont(new Font("arial",0,30)); //Asignar
        botonInstrucc.setOpaque(true);
        botonInstrucc.setBackground(Color.black);

        ActionListener capturarAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                ConfigGame configuracion = new ConfigGame();
                configuracion.setVisible(true);
                configuracion.showInstructions();
                configuracion.botonn();
            }
        };
        botonInstrucc.addActionListener(capturarAccion);
        panel.add(botonInstrucc);// Se agrega el boton "Instrucciones" al panel

        //CREANDO LOS LABELS DE TIPO IMAGEN PARA LA VENTANA
        ImageIcon triangulo = new ImageIcon("triangulo.png");
        JLabel figura1 = new JLabel(new ImageIcon("triangulo.png")); //Creando el objeto figura.
        figura1.setBounds(-20,325,260,300);
        figura1.setIcon(new ImageIcon(triangulo.getImage().getScaledInstance(figura1.getWidth(),figura1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(figura1);

        ImageIcon circulo = new ImageIcon("circulo.png");
        JLabel figura2 = new JLabel(new ImageIcon("circulo.png")); //Creando el objeto figura.
        figura2.setBounds(300,365,250,200);
        figura2.setIcon(new ImageIcon(circulo.getImage().getScaledInstance(figura2.getWidth(),figura2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(figura2);


    }
}
