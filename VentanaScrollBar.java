import javax.swing.*;
import java.awt.event.*;

public class VentanaScrollBar extends JFrame implements AdjustmentListener {

    JScrollBar desValor;
    JLabel etiValor;

    public VentanaScrollBar() {
        setTitle("Barra de desplazamiento");
        setSize(350, 150);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        desValor = new JScrollBar(JScrollBar.HORIZONTAL, 70, 5, 50, 150);
        desValor.setBounds(20, 20, 300, 30);
        desValor.setUnitIncrement(2);
        desValor.setBlockIncrement(20);
        desValor.addAdjustmentListener(this);
        add(desValor);

        etiValor = new JLabel("El valor es: " + desValor.getValue());
        etiValor.setBounds(20, 70, 200, 30);
        etiValor.setBorder(BorderFactory.createEtchedBorder());
        add(etiValor);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        etiValor.setText("El valor es: " + desValor.getValue());
    }

    public static void main(String[] args) {
        new VentanaScrollBar().setVisible(true);
    }
}

