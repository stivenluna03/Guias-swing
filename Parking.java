import javax.swing.*;
public class Parking extends JFrame {


    int coches;

    // 🔧 Componentes
    private JButton btnEntro, btnSalio, btnReiniciar;
    private JLabel etiCoches, etiTitulo;

    public Parking() {
        initComponents();
        coches = 0; 
        etiCoches.setText("" + coches);
    }

    private void initComponents() {
        setTitle("Control de Parking");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); //  layout manual 

        
        etiTitulo = new JLabel("Coches en el Parking:");
        etiTitulo.setBounds(30, 20, 200, 20);
        add(etiTitulo);

      
        etiCoches = new JLabel("0", SwingConstants.CENTER);
        etiCoches.setBounds(180, 15, 50, 30);
        etiCoches.setBorder(BorderFactory.createEtchedBorder());
        add(etiCoches);

        btnEntro = new JButton("Entró un coche");
        btnEntro.setBounds(30, 60, 200, 25);
        btnEntro.addActionListener(e -> {
            coches++;
            etiCoches.setText("" + coches);
        });
        add(btnEntro);


        btnSalio = new JButton("Salió un coche");
        btnSalio.setBounds(30, 90, 200, 25);
        btnSalio.addActionListener(e -> {
            if (coches > 0) {
                coches--;
                etiCoches.setText("" + coches);
            }
        });
        add(btnSalio);

        btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setBounds(30, 120, 200, 25);
        btnReiniciar.addActionListener(e -> {
            coches = 0;
            etiCoches.setText("0");
        });
        add(btnReiniciar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Parking().setVisible(true));
    }
}

