import javax.swing.*;
import java.awt.event.*;

public class VentanaCombo extends JFrame implements ActionListener {

    JComboBox<String> cboColores;
    JLabel etiResultado;

    public VentanaCombo() {
        setTitle("Combo de Colores");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Combo de colores
        String[] colores = {"Rojo", "Verde", "Azul"};
        cboColores = new JComboBox<>(colores);
        cboColores.setBounds(30, 30, 100, 30);
        cboColores.addActionListener(this);
        cboColores.setEditable(true); // Para permitir escribir
        add(cboColores);

        // Etiqueta resultado
        etiResultado = new JLabel("");
        etiResultado.setBounds(30, 80, 220, 30);
        etiResultado.setBorder(BorderFactory.createEtchedBorder());
        add(etiResultado);
    }

    public void actionPerformed(ActionEvent e) {
        String mensaje = "El color elegido es ";
        mensaje += cboColores.getSelectedItem().toString();
        etiResultado.setText(mensaje);
    }

    public static void main(String[] args) {
        new VentanaCombo().setVisible(true);
    }
}
