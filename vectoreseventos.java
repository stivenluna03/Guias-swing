import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class vectoreseventos extends JFrame {

    private JLabel etiNum1, etiNum2;
    private JTextField txtNum1, txtNum2;
    private JButton btnSumar, btnRestar;

    public vectoreseventos() {
        initComponents();
        CreacionVentana();
    }

    private void initComponents() {
        // Inicialización de componentes
        etiNum1 = new JLabel();
        etiNum2 = new JLabel();
        txtNum1 = new JTextField();
        txtNum2 = new JTextField();
        btnSumar = new JButton();
        btnRestar = new JButton();
    }

    public void CreacionVentana() {
        this.setTitle("Programa Operaciones");
        this.setSize(500, 300);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Etiquetas
        etiNum1.setText("Número 1:");
        etiNum1.setBounds(10, 10, 100, 20);
        this.getContentPane().add(etiNum1);

        etiNum2.setText("Número 2:");
        etiNum2.setBounds(10, 60, 100, 20);
        this.getContentPane().add(etiNum2);

        // Campos de texto
        txtNum1.setText("0");
        txtNum1.setBounds(110, 10, 100, 20);
        this.getContentPane().add(txtNum1);

        txtNum2.setText("0");
        txtNum2.setBounds(110, 60, 100, 20);
        this.getContentPane().add(txtNum2);

        // Botones
        btnSumar.setText("Sumar");
        btnSumar.setBounds(10, 120, 100, 20);
        this.getContentPane().add(btnSumar);

        btnRestar.setText("Restar");
        btnRestar.setBounds(150, 120, 100, 20);
        this.getContentPane().add(btnRestar);

        // Asignación de eventos
        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
    }

    public void btnSumarActionPerformed(ActionEvent evt) {
        double a, b, s;
        a = Double.parseDouble(txtNum1.getText());
        b = Double.parseDouble(txtNum2.getText());
        s = a + b;
        JOptionPane.showMessageDialog(null, "La suma es " + s);
    }

    public void btnRestarActionPerformed(ActionEvent evt) {
        double a, b, r;
        a = Double.parseDouble(txtNum1.getText());
        b = Double.parseDouble(txtNum2.getText());
        r = a - b;
        JOptionPane.showMessageDialog(null, "La resta es " + r);
    }

    public static void main(String[] args) {
        // Ejecutar la ventana principal
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vectoreseventos().setVisible(true);
            }
        });
    }
}
