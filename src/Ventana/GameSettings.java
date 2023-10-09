// creators: Juan Viedman 2242562 - Daniel Enriquez 2240920
package Ventana;

import jdk.jfr.Enabled;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameSettings extends JFrame {
    public JPanel panel;
    public GameSettings(){
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

        ActionListener playButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                PlayerWindow text = new PlayerWindow();
                text.text();
                text.getTextPlayer();
                text.buttonAcept();
                text.buttonCancel();
                text.setVisible(true);
            }
        };
        jugarButonn().addActionListener(playButton);


        ActionListener volver = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Window principalWindow = new Window();
                principalWindow.setVisible(true);
            }
        };
        volverButton().addActionListener(volver);
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

    public JButton jugarButonn() {
        JButton jugarButton = new JButton("Jugar");
        jugarButton.setBounds(400, 260, 120,50);
        jugarButton.setEnabled(true);
        jugarButton.setFont(new Font("Assistant", Font.BOLD, 15));
        jugarButton.setBackground(Color.gray);
        panel.add(jugarButton);
        return jugarButton;
    };


    public JButton volverButton() {
        JButton volverButton = new JButton("Volver");
        volverButton.setBounds(400, 320, 120,50);
        volverButton.setEnabled(true);
        volverButton.setFont(new Font("Assistant", Font.BOLD, 15));
        volverButton.setBackground(Color.gray);
        panel.add(volverButton);
        return volverButton;
    }
};



