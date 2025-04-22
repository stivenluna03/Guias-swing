import javax.swing.*;
import java.awt.*;

public class VentanaConTodosLosLayouts {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo con Todos los Layouts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new BorderLayout());

        JPanel panelAbsolute = new JPanel();
        panelAbsolute.setLayout(null);
        JLabel labelAbsolute = new JLabel("AbsoluteLayout");
        JButton buttonAbsolute = new JButton("Botón Absolute");
        labelAbsolute.setBounds(50, 50, 150, 30);
        buttonAbsolute.setBounds(50, 100, 150, 30);
        panelAbsolute.add(labelAbsolute);
        panelAbsolute.add(buttonAbsolute);

        JPanel panelFlow = new JPanel();
        panelFlow.setLayout(new FlowLayout());
        JLabel labelFlow = new JLabel("FlowLayout");
        JButton buttonFlow1 = new JButton("Botón Flow 1");
        JButton buttonFlow2 = new JButton("Botón Flow 2");
        panelFlow.add(labelFlow);
        panelFlow.add(buttonFlow1);
        panelFlow.add(buttonFlow2);

        JPanel panelGrid = new JPanel();
        panelGrid.setLayout(new GridLayout(2, 3));
        JLabel labelGrid = new JLabel("GridLayout");
        JButton buttonGrid1 = new JButton("Botón 1");
        JButton buttonGrid2 = new JButton("Botón 2");
        JButton buttonGrid3 = new JButton("Botón 3");
        JButton buttonGrid4 = new JButton("Botón 4");
        JButton buttonGrid5 = new JButton("Botón 5");
        panelGrid.add(labelGrid);
        panelGrid.add(buttonGrid1);
        panelGrid.add(buttonGrid2);
        panelGrid.add(buttonGrid3);
        panelGrid.add(buttonGrid4);
        panelGrid.add(buttonGrid5);

        frame.add(panelAbsolute, BorderLayout.NORTH);
        frame.add(panelFlow, BorderLayout.CENTER);
        frame.add(panelGrid, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}

