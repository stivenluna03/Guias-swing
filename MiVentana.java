import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiVentana extends JFrame {
    // Variables globales
    JLabel etiZona;
    JLabel etiMensaje;

    // Constructor de la clase
    public MiVentana() {
        // Llamada al procedimiento CreacionVentana
        CreacionVentana();
    }

    // Método para crear la ventana y sus componentes
    public void CreacionVentana() {
        // Configuración de la ventana
        setLayout(null);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear etiquetas
        etiZona = new JLabel("Zona Roja");
        etiZona.setBounds(50, 50, 100, 30);
        etiZona.setBackground(Color.RED);
        etiZona.setOpaque(true);

        etiMensaje = new JLabel("Mensaje");
        etiMensaje.setBounds(50, 100, 200, 30);

        // Agregar etiquetas a la ventana
        add(etiZona);
        add(etiMensaje);

        // Añadir el MouseListener a la etiqueta 'etiZona'
        etiZona.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                etiZonaMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                etiZonaMouseExited(evt);
            }

            public void mousePressed(MouseEvent evt) {
                etiZonaMousePressed(evt);
            }
        });

        // Hacer visible la ventana
        setVisible(true);
    }

    // Procedimiento que se ejecuta cuando el ratón entra en la zona roja
    public void etiZonaMouseEntered(MouseEvent evt) {
        etiMensaje.setText("Ratón dentro de la zona roja");
    }

    // Procedimiento que se ejecuta cuando el ratón sale de la zona roja
    public void etiZonaMouseExited(MouseEvent evt) {
        etiMensaje.setText("Ratón fuera de la zona roja");
    }

    // Procedimiento que se ejecuta cuando se presiona un botón del ratón
    public void etiZonaMousePressed(MouseEvent evt) {
        if (evt.getButton() == MouseEvent.BUTTON1) {
            etiMensaje.setText("Botón izquierdo presionado");
        } else if (evt.getButton() == MouseEvent.BUTTON2) {
            etiMensaje.setText("Botón central presionado");
        } else if (evt.getButton() == MouseEvent.BUTTON3) {
            etiMensaje.setText("Botón derecho presionado");
        }
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        // Crear y mostrar la ventana
        new MiVentana();
    }
}
