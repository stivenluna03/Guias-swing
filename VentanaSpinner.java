import javax.swing.*;
import javax.swing.event.*;
import javax.swing.SpinnerNumberModel;

public class VentanaSpinner extends JFrame implements ChangeListener {

    JSpinner spiValor;
    JLabel etiValor;

    public VentanaSpinner() {
        setTitle("Spinner");
        setSize(300, 150);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        SpinnerNumberModel modelo = new SpinnerNumberModel();
        modelo.setMinimum(0);
        modelo.setMaximum(10);
        modelo.setStepSize(2);
        modelo.setValue(4); // Valor inicial

        spiValor = new JSpinner(modelo);
        spiValor.setBounds(30, 20, 80, 30);
        spiValor.addChangeListener(this);
        add(spiValor);

        etiValor = new JLabel("El valor es: " + spiValor.getValue().toString());
        etiValor.setBounds(30, 60, 200, 30);
        etiValor.setBorder(BorderFactory.createEtchedBorder());
        add(etiValor);
    }

    public void stateChanged(ChangeEvent e) {
        etiValor.setText("El valor es: " + spiValor.getValue().toString());
    }

    public static void main(String[] args) {
        new VentanaSpinner().setVisible(true);
    }
}
