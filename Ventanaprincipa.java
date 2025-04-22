import javax.swing.*;
import java.awt.event.*;

public class Ventanaprincipa extends JFrame {

    // Variables globales
    double iva = 0;
    double descuento = 0;

    // Componentes de la ventana principal
    private JTextField txtUnidades;
    private JTextField txtPrecio;
    private JLabel etiTotal;
    private JButton btnCalcular;
    private JButton btnConfiguracion;

    // Cuadro de diálogo de configuración
    private JDialog dialogoConfiguracion;
    private JTextField txtIva;
    private JTextField txtDescuento;
    private JButton btnAceptar;
    private JButton btnCancelar;

    public Ventanaprincipa() {
      
        setTitle("Calculadora de Venta");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    
        txtUnidades = new JTextField(10);
        txtPrecio = new JTextField(10);
        etiTotal = new JLabel("Total: 0.0");
        btnCalcular = new JButton("Calcular");
        btnConfiguracion = new JButton("Configuración");

     
        setLayout(null);
        txtUnidades.setBounds(100, 30, 100, 30);
        txtPrecio.setBounds(100, 70, 100, 30);
        etiTotal.setBounds(100, 110, 200, 30);
        btnCalcular.setBounds(100, 150, 100, 30);
        btnConfiguracion.setBounds(100, 190, 150, 30);

        add(txtUnidades);
        add(txtPrecio);
        add(etiTotal);
        add(btnCalcular);
        add(btnConfiguracion);

     
        dialogoConfiguracion = new JDialog(this, "Configuración de IVA y Descuento", true);
        dialogoConfiguracion.setLayout(null);
        dialogoConfiguracion.setSize(250, 200);
        dialogoConfiguracion.setLocation(100, 100);

        txtIva = new JTextField(10);
        txtDescuento = new JTextField(10);
        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");

        txtIva.setBounds(100, 30, 100, 30);
        txtDescuento.setBounds(100, 70, 100, 30);
        btnAceptar.setBounds(30, 120, 80, 30);
        btnCancelar.setBounds(130, 120, 80, 30);

        dialogoConfiguracion.add(txtIva);
        dialogoConfiguracion.add(txtDescuento);
        dialogoConfiguracion.add(btnAceptar);
        dialogoConfiguracion.add(btnCancelar);

       
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double unidades = Double.parseDouble(txtUnidades.getText());
                double precio = Double.parseDouble(txtPrecio.getText());

                
                double totalsiniva = precio * unidades;
                double cantiva = totalsiniva * iva / 100;
                double cantdes = totalsiniva * descuento / 100;

             
                double total = totalsiniva + cantiva - cantdes;

                etiTotal.setText("Total: " + total);
            }
        });

      
        btnConfiguracion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogoConfiguracion.setVisible(true);
            }
        });

     
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogoConfiguracion.dispose();
            }
        });

        
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iva = Double.parseDouble(txtIva.getText());
                descuento = Double.parseDouble(txtDescuento.getText());
                dialogoConfiguracion.dispose();
            }
        });
    }

    public static void main(String[] args) {
      
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}

