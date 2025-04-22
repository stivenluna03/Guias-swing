import javax.swing.*;
import java.awt.*;

public class VentanaCompleja {

    public static void main(String[] args) {
        // Crear la ventana principal (JFrame)
        JFrame frame = new JFrame("Ventana Compleja");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Asignar un BorderLayout al JFrame
        frame.setLayout(new BorderLayout());

        // Panel en la zona norte
        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new FlowLayout());
        JLabel labelTitulo1 = new JLabel("Nombre del Programa");
        labelTitulo1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JLabel labelTitulo2 = new JLabel("Subtítulo");
        labelTitulo2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelTitulo.add(labelTitulo1);
        panelTitulo.add(labelTitulo2);
        frame.add(panelTitulo, BorderLayout.NORTH);

        // Panel en la zona central
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(2, 2));
        JPanel panelEtiqueta1 = new JPanel();
        panelEtiqueta1.add(new JLabel("Etiqueta 1"));
        JPanel panelCuadro1 = new JPanel();
        panelCuadro1.add(new JTextField(10));
        JPanel panelEtiqueta2 = new JPanel();
        panelEtiqueta2.add(new JLabel("Etiqueta 2"));
        JPanel panelCuadro2 = new JPanel();
        panelCuadro2.add(new JTextField(10));
        panelDatos.add(panelEtiqueta1);
        panelDatos.add(panelCuadro1);
        panelDatos.add(panelEtiqueta2);
        panelDatos.add(panelCuadro2);
        frame.add(panelDatos, BorderLayout.CENTER);

        // Panel en la zona sur
        JPanel panelEstado = new JPanel();
        panelEstado.setLayout(null);
        JLabel estado1 = new JLabel("Estado 1");
        estado1.setBounds(350, 10, 100, 20);
        JLabel estado2 = new JLabel("Estado 2");
        estado2.setBounds(350, 40, 100, 20);
        JLabel estado3 = new JLabel("Estado 3");
        estado3.setBounds(350, 70, 100, 20);
        panelEstado.add(estado1);
        panelEstado.add(estado2);
        panelEstado.add(estado3);
        frame.add(panelEstado, BorderLayout.SOUTH);

        // Panel en la zona oeste
        JPanel panelBotonera = new JPanel();
        panelBotonera.setLayout(null);
        JButton boton1 = new JButton("Botón 1");
        boton1.setBounds(10, 10, 100, 30);
        JButton boton2 = new JButton("Botón 2");
        boton2.setBounds(10, 50, 100, 30);
        JButton boton3 = new JButton("Botón 3");
        boton3.setBounds(10, 90, 100, 30);
        JButton boton4 = new JButton("Botón 4");
        boton4.setBounds(10, 130, 100, 30);
        panelBotonera.add(boton1);
        panelBotonera.add(boton2);
        panelBotonera.add(boton3);
        panelBotonera.add(boton4);
        frame.add(panelBotonera, BorderLayout.WEST);

        // Panel en la zona este
        JPanel panelVerificacion = new JPanel();
        panelVerificacion.setLayout(null);
        JCheckBox check1 = new JCheckBox("Verificación 1");
        check1.setBounds(10, 10, 150, 20);
        JCheckBox check2 = new JCheckBox("Verificación 2");
        check2.setBounds(10, 40, 150, 20);
        JCheckBox check3 = new JCheckBox("Verificación 3");
        check3.setBounds(10, 70, 150, 20);
        JCheckBox check4 = new JCheckBox("Verificación 4");
        check4.setBounds(10, 100, 150, 20);
        panelVerificacion.add(check1);
        panelVerificacion.add(check2);
        panelVerificacion.add(check3);
        panelVerificacion.add(check4);
        frame.add(panelVerificacion, BorderLayout.EAST);

        // Hacer la ventana visible
        frame.setVisible(true);
    }
}
