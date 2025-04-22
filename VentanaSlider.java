import javax.swing.*;
import javax.swing.event.*;

public class VentanaSlider extends JFrame implements ChangeListener {

    JSlider slDeslizador;
    JLabel etiValor;

    public VentanaSlider() {
        setTitle("Deslizador");
        setSize(400, 150);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        slDeslizador = new JSlider(JSlider.HORIZONTAL, 100, 500, 400);
        slDeslizador.setBounds(20, 20, 350, 50);
        slDeslizador.setMajorTickSpacing(50);
        slDeslizador.setPaintTicks(true);
        slDeslizador.setPaintLabels(true);
        slDeslizador.addChangeListener(this);
        add(slDeslizador);

        etiValor = new JLabel("El valor es: " + slDeslizador.getValue());
        etiValor.setBounds(20, 80, 200, 30);
        etiValor.setBorder(BorderFactory.createEtchedBorder());
        add(etiValor);
    }

    public void stateChanged(ChangeEvent e) {
        etiValor.setText("El valor es: " + slDeslizador.getValue());
    }

    public static void main(String[] args) {
        new VentanaSlider().setVisible(true);
    }
}

