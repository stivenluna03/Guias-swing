import javax.swing.*;
import java.awt.event.*;

public class guia26 extends JFrame {
    JButton vbotones[];
    String textos[] = {"Rojo", "Verde", "Azul", "Amarillo", "Naranja"};

    public guia26() {
        CreacionVentana();
    }

    public void CreacionVentana() {
        this.setLayout(null);
        this.setTitle("Botones con Vectores");
        this.setSize(300, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        vbotones = new JButton[5];

        for (int i = 0; i < vbotones.length; i++) {
            vbotones[i] = new JButton();
            vbotones[i].setText(textos[i]);
            vbotones[i].setBounds(50, 20 + i * 40, 180, 30);
            this.getContentPane().add(vbotones[i]);
        }

        for (int i = 0; i < vbotones.length; i++) {
            vbotones[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    botonesActionPerformed(evt);
                }
            });
        }
    }

    public void botonesActionPerformed(ActionEvent evt) {
        JButton botonPulsado = (JButton) evt.getSource();
        JOptionPane.showMessageDialog(this, "Has pulsado el botón: " + botonPulsado.getText());
    }

    public static void main(String[] args) {
        new guia26().setVisible(true);
    }
}
