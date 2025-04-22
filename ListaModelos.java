import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.DefaultListModel;

public class ListaModelos extends JFrame implements ActionListener {
    JList<String> lstNombres;
    DefaultListModel<String> modelo;
    JButton btnCurso1, btnCurso2, btnVaciar;
    JLabel etiResultado;

    public ListaModelos() {
        setTitle("Lista con Modelos");
        setSize(350, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        modelo = new DefaultListModel<>();
        lstNombres = new JList<>(modelo);
        JScrollPane scrollPane = new JScrollPane(lstNombres);
        scrollPane.setBounds(30, 20, 100, 100);
        add(scrollPane);

        etiResultado = new JLabel("");
        etiResultado.setBounds(150, 20, 150, 30);
        etiResultado.setBorder(BorderFactory.createEtchedBorder());
        add(etiResultado);

        btnCurso1 = new JButton("Curso 1");
        btnCurso1.setBounds(30, 140, 100, 30);
        btnCurso1.addActionListener(this);
        add(btnCurso1);

        btnCurso2 = new JButton("Curso 2");
        btnCurso2.setBounds(150, 140, 100, 30);
        btnCurso2.addActionListener(this);
        add(btnCurso2);

        btnVaciar = new JButton("Vaciar");
        btnVaciar.setBounds(90, 180, 100, 30);
        btnVaciar.addActionListener(this);
        add(btnVaciar);

        lstNombres.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (!lstNombres.isSelectionEmpty()) {
                    etiResultado.setText(lstNombres.getSelectedValue().toString());
                }
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCurso1) {
            modelo = new DefaultListModel<>();
            modelo.addElement("Juan");
            modelo.addElement("María");
            modelo.addElement("Luis");
            lstNombres.setModel(modelo);
        } else if (e.getSource() == btnCurso2) {
            modelo = new DefaultListModel<>();
            modelo.addElement("Ana");
            modelo.addElement("Marta");
            modelo.addElement("Jose");
            lstNombres.setModel(modelo);
        } else if (e.getSource() == btnVaciar) {
            lstNombres.setModel(new DefaultListModel<>());
        }
    }

    public static void main(String[] args) {
        new ListaModelos().setVisible(true);
    }
}
