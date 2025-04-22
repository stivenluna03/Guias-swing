import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuEmergenteEjemplo extends JFrame {

    private JPopupMenu menuEmergente;
    private JMenuItem menuRojo, menuVerde, menuAzul;

    public MenuEmergenteEjemplo() {
        setTitle("Ejemplo Menú Emergente");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear el menú emergente y sus opciones
        menuEmergente = new JPopupMenu();

        menuRojo = new JMenuItem("Rojo");
        menuVerde = new JMenuItem("Verde");
        menuAzul = new JMenuItem("Azul");

        menuEmergente.add(menuRojo);
        menuEmergente.add(menuVerde);
        menuEmergente.add(menuAzul);

        // Agregar acciones a cada opción
        menuRojo.addActionListener(e -> getContentPane().setBackground(Color.RED));
        menuVerde.addActionListener(e -> getContentPane().setBackground(Color.GREEN));
        menuAzul.addActionListener(e -> getContentPane().setBackground(Color.BLUE));

        // Escuchar los clics en el formulario
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                if (evt.getButton() == MouseEvent.BUTTON3) { // Botón derecho
                    menuEmergente.show(MenuEmergenteEjemplo.this, evt.getX(), evt.getY());
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MenuEmergenteEjemplo().setVisible(true);
        });
    }
}

