import javax.swing.*;
import java.awt.event.*;

public class VentanaLista extends JFrame implements ActionListener {

    JList<String> lstColores;
    JButton btnAceptar;
    JLabel etiResultado;

    public VentanaLista() {
        setTitle("Lista de Colores");
        setSize(300, 250);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Lista de colores
        String[] colores = {"Rojo", "Verde", "Azul"};
        lstColores = new JList<>(colores);
        JScrollPane scrollPane = new JScrollPane(lstColores);
        scrollPane.setBounds(30, 20, 100, 70);
        add(scrollPane);

        // Botón Aceptar
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(150, 30, 100, 30);
        btnAceptar.addActionListener(this);
        add(btnAceptar);

        // Etiqueta Resultado
        etiResultado = new JLabel("");
        etiResultado.setBounds(30, 110, 220, 30);
        etiResultado.setBorder(BorderFactory.createEtchedBorder());
        add(etiResultado);
    }

    public void actionPerformed(ActionEvent e) {
        String mensaje;
        if (lstColores.getSelectedIndex() == -1) {
            mensaje = "No hay un color seleccionado.";
        } else {
            mensaje = "El color seleccionado es: " + lstColores.getSelectedValue().toString();
        }
        etiResultado.setText(mensaje);
    }

    public static void main(String[] args) {
        new VentanaLista().setVisible(true);
    }
}
