import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class raton {
    
    // Variables globales
    JLabel etiZona, etiMensaje;

    public raton() {
        CreacionVentana();
    }

    public static void main(String[] args) {
        new raton();
    }
    
    public void CreacionVentana() {
        // Crear la ventana
        JFrame ventana = new JFrame("Eventos de Ratón");
        ventana.setLayout(null);
        
        // Crear las etiquetas
        etiZona = new JLabel("Zona de Ratón");
        etiZona.setBounds(50, 50, 150, 30);
        etiZona.setBackground(Color.RED);
        etiZona.setOpaque(true);
        
        etiMensaje = new JLabel("Mensaje");
        etiMensaje.setBounds(50, 100, 150, 30);
        
        // Añadir las etiquetas a la ventana
        ventana.add(etiZona);
        ventana.add(etiMensaje);
        
        // Añadir el MouseAdapter para manejar los eventos de ratón
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

        // Configurar la ventana
        ventana.setSize(400, 300);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Procedimientos para manejar los eventos de ratón
    public void etiZonaMouseEntered(MouseEvent evt) {
        etiMensaje.setText("El ratón entró.");
    }

    public void etiZonaMouseExited(MouseEvent evt) {
        etiMensaje.setText("El ratón salió.");
    }

    public void etiZonaMousePressed(MouseEvent evt) {
        int boton = evt.getButton();
        if (boton == MouseEvent.BUTTON1) {
            etiMensaje.setText("Se presionó el botón izquierdo.");
        } else if (boton == MouseEvent.BUTTON2) {
            etiMensaje.setText("Se presionó el botón central.");
        } else if (boton == MouseEvent.BUTTON3) {
            etiMensaje.setText("Se presionó el botón derecho.");
        }
    }
}

