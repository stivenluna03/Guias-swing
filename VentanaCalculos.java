import javax.swing.*;
import java.awt.event.*;
public class VentanaCalculos extends JFrame {

    // Componentes
    private JTextField txtNumero1, txtNumero2;
    private JLabel etiResultado;
    private JButton btnSumar, btnRestar, btnBorrar;
    private JMenuBar menuBarra;
    private JMenu menuCalcular;
    private JMenuItem menuSumar, menuRestar, menuBorrar;

    public VentanaCalculos() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Ventana de Cálculos");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Etiquetas
        JLabel lblNumero1 = new JLabel("Número 1:");
        lblNumero1.setBounds(30, 30, 70, 25);
        add(lblNumero1);

        JLabel lblNumero2 = new JLabel("Número 2:");
        lblNumero2.setBounds(30, 70, 70, 25);
        add(lblNumero2);

        etiResultado = new JLabel("Resultado: ");
        etiResultado.setBounds(30, 110, 200, 25);
        add(etiResultado);

        // TextFields
        txtNumero1 = new JTextField("0");
        txtNumero1.setBounds(110, 30, 100, 25);
        txtNumero1.addActionListener(e -> Sumar());
        add(txtNumero1);

        txtNumero2 = new JTextField("0");
        txtNumero2.setBounds(110, 70, 100, 25);
        txtNumero2.addActionListener(e -> Sumar());
        add(txtNumero2);

        // Botones
        btnSumar = new JButton("Sumar");
        btnSumar.setBounds(30, 150, 80, 25);
        btnSumar.addActionListener(e -> Sumar());
        add(btnSumar);

        btnRestar = new JButton("Restar");
        btnRestar.setBounds(120, 150, 80, 25);
        btnRestar.addActionListener(e -> Restar());
        add(btnRestar);

        btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(210, 150, 80, 25);
        btnBorrar.addActionListener(e -> Borrar());
        add(btnBorrar);

        // Menú
        menuBarra = new JMenuBar();
        menuCalcular = new JMenu("Calcular");

        menuSumar = new JMenuItem("Sumar");
        menuSumar.addActionListener(e -> Sumar());

        menuRestar = new JMenuItem("Restar");
        menuRestar.addActionListener(e -> Restar());

        menuBorrar = new JMenuItem("Borrar");
        menuBorrar.addActionListener(e -> Borrar());

        menuCalcular.add(menuSumar);
        menuCalcular.add(menuRestar);
        menuCalcular.add(menuBorrar);
        menuBarra.add(menuCalcular);
        setJMenuBar(menuBarra);
    }

    // Método para sumar
    void Sumar() {
        String cad1 = txtNumero1.getText();
        String cad2 = txtNumero2.getText();
        try {
            int a = Integer.parseInt(cad1);
            int b = Integer.parseInt(cad2);
            int s = a + b;
            etiResultado.setText("Resultado: " + s);
        } catch (NumberFormatException e) {
            etiResultado.setText("Error: valores inválidos");
        }
    }

    // Método para restar
    void Restar() {
        String cad1 = txtNumero1.getText();
        String cad2 = txtNumero2.getText();
        try {
            int a = Integer.parseInt(cad1);
            int b = Integer.parseInt(cad2);
            int r = a - b;
            etiResultado.setText("Resultado: " + r);
        } catch (NumberFormatException e) {
            etiResultado.setText("Error: valores inválidos");
        }
    }

    // Método para borrar
    void Borrar() {
        txtNumero1.setText("0");
        txtNumero2.setText("0");
        etiResultado.setText("Resultado:");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaCalculos().setVisible(true));
    }
}
