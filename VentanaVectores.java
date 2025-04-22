import javax.swing.*;

public class VentanaVectores extends JFrame {
    JCheckBox vcuadros[];
    JButton btnAceptar;
    String textos[] = {"Rojo", "Verde", "Azul", "Amarillo", "Naranja", "Gris", "Negro", "Blanco", "Rosa", "Morado"};

    public VentanaVectores() {
        CreacionVentana();
    }

    public void CreacionVentana() {
        this.setLayout(null);
        this.setTitle("Ejercicio con Vectores");
        this.setSize(200, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        vcuadros = new JCheckBox[10];

        for (int i = 0; i < vcuadros.length; i++) {
            vcuadros[i] = new JCheckBox();
            vcuadros[i].setText(textos[i]);
            vcuadros[i].setBounds(10, 10 + 30 * i, 100, 20);
            this.getContentPane().add(vcuadros[i]);
        }

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(10, 320, 100, 30);
        this.getContentPane().add(btnAceptar);
        btnAceptar.addActionListener(e -> btnAceptarActionPerformed());
    }

    public void btnAceptarActionPerformed() {
        int contador = 0;
        for (int i = 0; i < vcuadros.length; i++) {
            if (vcuadros[i].isSelected()) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(this, "Hay " + contador + " cuadros seleccionados.");
    }

    public static void main(String[] args) {
        new VentanaVectores().setVisible(true);
    }
}
