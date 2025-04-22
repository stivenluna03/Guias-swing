import javax.swing.*;

public class principalventana extends JFrame {

    // Declaración de los componentes
    private JLabel etiNum1, etiNum2;
    private JTextField txtNum1, txtNum2;
    private JButton btnSumar, btnRestar;

    public principalventana() {
        initComponents();
        CreacionVentana();
    }

    private void initComponents() {
        // Este método genera código automáticamente
    }

    private void CreacionVentana() {
        // Definir características de la ventana
        this.setTitle("Operaciones");
        this.setSize(500, 300);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear etiquetas y asignarles texto
        etiNum1 = new JLabel("Número 1:");
        etiNum1.setBounds(10, 10, 100, 20);
        this.getContentPane().add(etiNum1);

        etiNum2 = new JLabel("Número 2:");
        etiNum2.setBounds(10, 60, 100, 20);
        this.getContentPane().add(etiNum2);

        // Crear cuadros de texto
        txtNum1 = new JTextField("0");
        txtNum1.setBounds(120, 10, 100, 20);
        this.getContentPane().add(txtNum1);

        txtNum2 = new JTextField("0");
        txtNum2.setBounds(120, 60, 100, 20);
        this.getContentPane().add(txtNum2);

        // Crear botones
        btnSumar = new JButton("Sumar");
        btnSumar.setBounds(10, 110, 100, 30);
        this.getContentPane().add(btnSumar);

        btnRestar = new JButton("Restar");
        btnRestar.setBounds(120, 110, 100, 30);
        this.getContentPane().add(btnRestar);

        // Hacer la ventana visible
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new principalventana();
    }
}
