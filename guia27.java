import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guia27 extends JFrame {

    JButton btnAceptar = new JButton();
    JButton btnCancelar = new JButton();

    public guia27() {
        setLayout(null);
        setTitle("Ejemplo de Botones");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnAceptar.setText("Aceptar");
        btnAceptar.setBounds(50, 50, 100, 30);
        btnAceptar.setBackground(Color.GREEN);
        add(btnAceptar);

        btnCancelar.setText("Cancelar");
        btnCancelar.setBounds(150, 50, 100, 30);
        btnCancelar.setBackground(Color.RED);
        add(btnCancelar);

        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Has pulsado Aceptar");
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Has pulsado Cancelar");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new guia27();
    }
}

