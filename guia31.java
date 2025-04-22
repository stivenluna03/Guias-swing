import javax.swing.*;
import java.awt.event.*;

public class guia31 extends JFrame {

    BotonContador botonA;
    BotonContador botonB;
    BotonContador botonC;
    JTextField txtInicializar;
    JButton btnIniciar;
    JButton btnVerPulsaciones;
    JButton btnReiniciar;

    public guia31() {
        crearVentana();
    }

    public void crearVentana() {
        setTitle("Contadores");
        setLayout(null);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        botonA = new BotonContador();
        botonA.setText("Botón A");
        botonA.setBounds(30, 30, 100, 30);
        add(botonA);

        botonB = new BotonContador();
        botonB.setText("Botón B");
        botonB.setBounds(150, 30, 100, 30);
        add(botonB);

        botonC = new BotonContador();
        botonC.setText("Botón C");
        botonC.setBounds(270, 30, 100, 30);
        add(botonC);

        btnVerPulsaciones = new JButton("Ver Pulsaciones");
        btnVerPulsaciones.setBounds(30, 80, 150, 30);
        add(btnVerPulsaciones);

        btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setBounds(200, 80, 100, 30);
        add(btnReiniciar);

        txtInicializar = new JTextField();
        txtInicializar.setBounds(30, 130, 100, 30);
        add(txtInicializar);

        btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(150, 130, 100, 30);
        add(btnIniciar);

        botonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                botonA.incrementa();
            }
        });

        botonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                botonB.incrementa();
            }
        });

        botonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                botonC.aumenta(2);
            }
        });

        btnVerPulsaciones.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String mensaje = "Pulsaciones A: " + botonA.getPulsaciones() + "\n" +
                                 "Pulsaciones B: " + botonB.getPulsaciones() + "\n" +
                                 "Pulsaciones C: " + botonC.getPulsaciones();
                JOptionPane.showMessageDialog(null, mensaje);
            }
        });

        btnReiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                botonA.reiniciar();
                botonB.reiniciar();
                botonC.reiniciar();
            }
        });

        btnIniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int valor = Integer.parseInt(txtInicializar.getText());
                    botonA.setPulsaciones(valor);
                    botonB.setPulsaciones(valor);
                    botonC.setPulsaciones(valor);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Introduce un número válido.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}

class BotonContador extends JButton {

    int pulsaciones;

    public BotonContador() {
        pulsaciones = 0;
    }

    public void setPulsaciones(int p) {
        pulsaciones = p;
    }

    public int getPulsaciones() {
        return pulsaciones;
    }

    public void incrementa() {
        pulsaciones++;
    }

    public void decrementa() {
        pulsaciones--;
    }

    public void reiniciar() {
        pulsaciones = 0;
    }

    public void aumenta(int c) {
        pulsaciones = pulsaciones + c;
    }

    public void disminuye(int c) {
        pulsaciones = pulsaciones - c;
    }
}
