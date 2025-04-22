import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class guia32 extends JFrame {
    private JButton btnFechaNacimiento;
    private JLabel etiFechaNacimiento;
    private JLabel etiFechaNacimientoLarga;
    private DialogoFecha nacimiento;

    public guia32() {
        setTitle("Fecha Nacimiento");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear el botón
        btnFechaNacimiento = new JButton("Introducir Fecha Nacimiento");
        btnFechaNacimiento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nacimiento.setVisible(true);
                if (nacimiento.getBotonPulsado() == 0) {
                    etiFechaNacimiento.setText(nacimiento.getFecha());
                    etiFechaNacimientoLarga.setText(nacimiento.getFechaLarga());
                } else {
                    etiFechaNacimiento.setText("");
                    etiFechaNacimientoLarga.setText("");
                }
            }
        });

        // Etiqueta para mostrar la fecha corta
        etiFechaNacimiento = new JLabel("");
        // Etiqueta para mostrar la fecha larga
        etiFechaNacimientoLarga = new JLabel("");

        // Layout y agregando componentes
        setLayout(new FlowLayout());
        add(btnFechaNacimiento);
        add(etiFechaNacimiento);
        add(etiFechaNacimientoLarga);

        // Crear el cuadro de diálogo para la fecha
        nacimiento = new DialogoFecha(this, true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
}

class DialogoFecha extends JDialog {
    private JTextField txtDia, txtMes, txtAnio;
    private JButton btnAceptar, btnCancelar;
    private int Dia, Mes, Anio, BotonPulsado;

    public DialogoFecha(Frame owner, boolean modal) {
        super(owner, modal);
        setTitle("Introducir Fecha");
        setSize(250, 200);
        setLocationRelativeTo(owner);

        // Crear los campos de texto
        txtDia = new JTextField(2);
        txtMes = new JTextField(2);
        txtAnio = new JTextField(4);
        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");

        // Layout y agregar componentes
        setLayout(new FlowLayout());
        add(new JLabel("Día:"));
        add(txtDia);
        add(new JLabel("Mes:"));
        add(txtMes);
        add(new JLabel("Año:"));
        add(txtAnio);
        add(btnAceptar);
        add(btnCancelar);

        // Acciones del botón Aceptar
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dia = Integer.parseInt(txtDia.getText());
                Mes = Integer.parseInt(txtMes.getText());
                Anio = Integer.parseInt(txtAnio.getText());
                BotonPulsado = 0;
                dispose();
            }
        });

        // Acciones del botón Cancelar
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BotonPulsado = 1;
                dispose();
            }
        });
    }

    public String getFecha() {
        return Dia + "/" + Mes + "/" + Anio;
    }

    public String getFechaLarga() {
        String mesLargo = "";
        switch (Mes) {
            case 1: mesLargo = "Enero"; break;
            case 2: mesLargo = "Febrero"; break;
            case 3: mesLargo = "Marzo"; break;
            case 4: mesLargo = "Abril"; break;
            case 5: mesLargo = "Mayo"; break;
            case 6: mesLargo = "Junio"; break;
            case 7: mesLargo = "Julio"; break;
            case 8: mesLargo = "Agosto"; break;
            case 9: mesLargo = "Septiembre"; break;
            case 10: mesLargo = "Octubre"; break;
            case 11: mesLargo = "Noviembre"; break;
            case 12: mesLargo = "Diciembre"; break;
        }
        return Dia + " de " + mesLargo + " de " + Anio;
    }

    public int getBotonPulsado() {
        return BotonPulsado;
    }
}
