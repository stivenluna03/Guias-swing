import javax.swing.*;
import java.awt.event.*;

public class VentanaColores extends JFrame implements ActionListener {

    JRadioButton optRojo, optVerde, optAzul;
    JButton btnAceptar;
    JLabel etiResultado;

    public VentanaColores() {
        setTitle("Colores");
        setSize(300, 250);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Panel con borde y título
        JPanel panelColores = new JPanel();
        panelColores.setLayout(null);
        panelColores.setBounds(30, 20, 220, 100);
        panelColores.setBorder(BorderFactory.createTitledBorder("Colores"));
        add(panelColores);

        // RadioButtons
        optRojo = new JRadioButton("Rojo");
        optRojo.setBounds(20, 20, 100, 20);
        panelColores.add(optRojo);

        optVerde = new JRadioButton("Verde");
        optVerde.setBounds(20, 40, 100, 20);
        panelColores.add(optVerde);

        optAzul = new JRadioButton("Azul");
        optAzul.setBounds(20, 60, 100, 20);
        panelColores.add(optAzul);

        // Grupo de botones
        ButtonGroup grupoColores = new ButtonGroup();
        grupoColores.add(optRojo);
        grupoColores.add(optVerde);
        grupoColores.add(optAzul);

        // Establecer opción predeterminada
        optRojo.setSelected(true);

        // Botón Aceptar
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(100, 130, 100, 30);
        btnAceptar.addActionListener(this);
        add(btnAceptar);

        // Etiqueta resultado
        etiResultado = new JLabel("");
        etiResultado.setBounds(30, 170, 220, 30);
        etiResultado.setBorder(BorderFactory.createEtchedBorder());
        add(etiResultado);
    }

    public void actionPerformed(ActionEvent e) {
        String mensaje = "Color elegido: ";

        if (optRojo.isSelected()) {
            mensaje += "Rojo";
        } else if (optVerde.isSelected()) {
            mensaje += "Verde";
        } else if (optAzul.isSelected()) {
            mensaje += "Azul";
        }

        etiResultado.setText(mensaje);
    }

    public static void main(String[] args) {
        new VentanaColores().setVisible(true);
    }
}

