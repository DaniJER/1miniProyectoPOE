package Ventana;
import javax.swing.*;

public class Player extends Ventana{
    //METODOS:
    public void askName(){
        //Colocar cajas de texto
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50,50,100,30);
        cajaTexto.setText("Ingresa tu nombre");
    }
}
