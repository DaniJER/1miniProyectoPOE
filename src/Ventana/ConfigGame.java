package Ventana;

import jdk.jfr.Enabled;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigGame extends JFrame {
    public JPanel panel;
    public ConfigGame(){
        setSize(950,600); //Dimensiones de la ventana
        setLocationRelativeTo(null); //Establecer la ubicacion de la ventana en el centro de la pantalla
        setResizable(true); //Metodo para establecer si se redimensiona la ventana o no. el valor es booleano.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Se establece un Stop a la ventana, una vez se haga click en la X
        setTitle("FIGURAS :)"); // Establecer titulo para la ventana
        this.getContentPane() .setBackground(Color.gray); //Obtener el contenido de la ventana y establecer un color a su background
        iniciarVentana();
    }

    private void iniciarVentana() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.add(panel);
    }

    public JLabel showInstructions(){
        var instruction = "<html>Observa la figura ubicada a la izquierda y escoge cual de las tres opciones tiene el mismo tamaño</html>";
        JLabel text = new JLabel();
        text.setText(instruction);
        text.setFont(new Font("Assistant", 0, 30));
        text.setBounds(0,0,950,250);
        Border margin = new EmptyBorder(100,100,100,100);
        text.setBorder(margin);
        panel.add(text);
        return text;
    }

    public void botonn() {
        JButton jugarButton = new JButton("Jugar");
        jugarButton.setBounds(400, 260, 120,50);
        jugarButton.setEnabled(true);
        jugarButton.setFont(new Font("Assistant", Font.BOLD, 15));
        jugarButton.setBackground(Color.gray);
        panel.add(jugarButton);
    }

    ActionListener playButton = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();

        }
    };
    //jugarButton.addActionListener(playButton);
}

