import javax.swing.*;
public class PrimeraClase {
    PrimeraClase() {
        JFrame frame = new JFrame();
        JButton boton = new JButton("Haz clic");
        boton.setBounds(130, 100, 100, 40);
        frame.add(boton);
        frame.setSize(300, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new PrimeraClase();
    }
}