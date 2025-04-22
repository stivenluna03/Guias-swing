import javax.swing.*;
import java.awt.event.*;

public class VentanaToggle extends JFrame implements ActionListener {

    JTextField txtPrecioBase;
    JLabel etiPrecioInstalacion, etiPrecioFormacion, etiPrecioAlimentacionBD, etiTotal;
    JToggleButton tbtnInstalacion, tbtnFormacion, tbtnAlimentacionBD;
    JButton btnCalcular;

    public VentanaToggle() {
        setTitle("Precio Total");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JLabel("Precio Base")).setBounds(30, 20, 100, 25);
        txtPrecioBase = new JTextField();
        txtPrecioBase.setBounds(150, 20, 100, 25);
        add(txtPrecioBase);

        tbtnInstalacion = new JToggleButton("Instalación");
        tbtnInstalacion.setBounds(30, 60, 120, 30);
        add(tbtnInstalacion);

        etiPrecioInstalacion = new JLabel("40");
        etiPrecioInstalacion.setBounds(160, 60, 50, 30);
        add(etiPrecioInstalacion);

        tbtnFormacion = new JToggleButton("Formación");
        tbtnFormacion.setBounds(30, 100, 120, 30);
        add(tbtnFormacion);

        etiPrecioFormacion = new JLabel("200");
        etiPrecioFormacion.setBounds(160, 100, 50, 30);
        add(etiPrecioFormacion);

        tbtnAlimentacionBD = new JToggleButton("Alimentación BD");
        tbtnAlimentacionBD.setBounds(30, 140, 140, 30);
        add(tbtnAlimentacionBD);

        etiPrecioAlimentacionBD = new JLabel("200");
        etiPrecioAlimentacionBD.setBounds(180, 140, 50, 30);
        add(etiPrecioAlimentacionBD);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 180, 100, 30);
        btnCalcular.addActionListener(this);
        add(btnCalcular);

        etiTotal = new JLabel("");
        etiTotal.setBounds(30, 220, 200, 40);
        etiTotal.setFont(etiTotal.getFont().deriveFont(16f));
        etiTotal.setBorder(BorderFactory.createEtchedBorder());
        add(etiTotal);

        // Activar instalación por defecto
        tbtnInstalacion.setSelected(true);
    }

    public void actionPerformed(ActionEvent e) {
        double precio_base = Double.parseDouble(txtPrecioBase.getText());
        double precio_instal = Double.parseDouble(etiPrecioInstalacion.getText());
        double precio_for = Double.parseDouble(etiPrecioFormacion.getText());
        double precio_ali = Double.parseDouble(etiPrecioAlimentacionBD.getText());

        double precio_total = precio_base;

        if (tbtnInstalacion.isSelected()) precio_total += precio_instal;
        if (tbtnFormacion.isSelected()) precio_total += precio_for;
        if (tbtnAlimentacionBD.isSelected()) precio_total += precio_ali;

        etiTotal.setText(precio_total + " €");
    }

    public static void main(String[] args) {
        new VentanaToggle().setVisible(true);
    }
}
