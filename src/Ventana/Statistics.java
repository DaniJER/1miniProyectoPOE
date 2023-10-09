// creators: Juan Viedman 2242562 - Daniel Enriquez 2240920
package Ventana;
import javax.swing.*;
import java.awt.*;

public class Statistics extends JFrame {
    public JPanel panel;

    public Statistics() {
        setSize(950, 600); //Dimensiones de la ventana
        setLocationRelativeTo(null); //Establecer la ubicacion de la ventana en el centro de la pantalla
        setResizable(true); //Metodo para establecer si se redimensiona la ventana o no. el valor es booleano.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Se establece un Stop a la ventana, una vez se haga click en la X
        setTitle("Felicitaciones"); // Establecer titulo para la ventana
        this.getContentPane().setBackground(Color.gray); //Obtener el contenido de la ventana y establecer un color a su background
        openWindow();
    }

    private void openWindow() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.add(panel);
    }

    public JLabel totalFiguresShown() {
        JLabel figuresShown = new JLabel();
        figuresShown.setBounds(500, 10, 380, 50);
        figuresShown.setFont(new Font("arial", 0, 25));
        figuresShown.setForeground(Color.black);
        figuresShown.setText("Felicitaciones");
        panel.add(figuresShown);
        return figuresShown;
    }

}
