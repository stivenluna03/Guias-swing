import javax.swing.*;
import java.awt.event.*;
import javax.swing.DefaultComboBoxModel;

public class ComboModelos extends JFrame implements ActionListener {
    JComboBox<String> cboNumeros;
    JButton btnPares, btnImpares, btnVaciar;
    JLabel etiResultado;

    public ComboModelos() {
        setTitle("Combo con Modelos");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cboNumeros = new JComboBox<>();
        cboNumeros.setBounds(30, 30, 100, 30);
        cboNumeros.addActionListener(this);
        add(cboNumeros);

        etiResultado = new JLabel("");
        etiResultado.setBounds(150, 30, 150, 30);
        etiResultado.setBorder(BorderFactory.createEtchedBorder());
        add(etiResultado);

        btnPares = new JButton("Pares");
        btnPares.setBounds(30, 80, 80, 30);
        btnPares.addActionListener(this);
        add(btnPares);

        btnImpares = new JButton("Impares");
        btnImpares.setBounds(120, 80, 100, 30);
        btnImpares.addActionListener(this);
        add(btnImpares);

        btnVaciar = new JButton("Vaciar");
        btnVaciar.setBounds(230, 80, 80, 30);
        btnVaciar.addActionListener(this);
        add(btnVaciar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnPares) {
            DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
            for (int i = 0; i < 10; i += 2) {
                modelo.addElement("Nº " + i);
            }
            cboNumeros.setModel(modelo);
        } else if (e.getSource() == btnImpares) {
            DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
            for (int i = 1; i < 10; i += 2) {
                modelo.addElement("Nº " + i);
            }
            cboNumeros.setModel(modelo);
        } else if (e.getSource() == btnVaciar) {
            cboNumeros.setModel(new DefaultComboBoxModel<>());
        } else if (e.getSource() == cboNumeros) {
            if (cboNumeros.getSelectedItem() != null) {
                etiResultado.setText(cboNumeros.getSelectedItem().toString());
            }
        }
    }

    public static void main(String[] args) {
        new ComboModelos().setVisible(true);
    }
}
