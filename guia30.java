import javax.swing.*;
public class guia30 extends JFrame {

    SalaCine central = new SalaCine();
    SalaCine vo = new SalaCine();
    JLabel etiCentralPelicula = new JLabel(""), etiVOPelicula = new JLabel("");

    public guia30() {
        setTitle("Multicines Avenida");
        setSize(400, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        central.setAforo(500);
        central.setEntrada(8.0);
        vo.setAforo(80);
        vo.setEntrada(6.0);

        JButton btnCentralCambiar = new JButton("Cambiar Central");
        JButton btnCentralNueva = new JButton("Nueva Entrada Central");
        JButton btnCentralOcupacion = new JButton("Ocupación Central");
        JButton btnCentralVaciar = new JButton("Vaciar Central");
        JButton btnCentralIngresos = new JButton("Ingresos Central");

        JButton btnVOCambiar = new JButton("Cambiar VO");
        JButton btnVONueva = new JButton("Nueva Entrada VO");
        JButton btnVOOcupacion = new JButton("Ocupación VO");
        JButton btnVOVaciar = new JButton("Vaciar VO");
        JButton btnVOIngresos = new JButton("Ingresos VO");

        JButton btnIngresosTotales = new JButton("Ingresos Totales");

        etiCentralPelicula.setBounds(30, 20, 300, 20);
        btnCentralCambiar.setBounds(30, 50, 300, 30);
        btnCentralNueva.setBounds(30, 90, 300, 30);
        btnCentralOcupacion.setBounds(30, 130, 300, 30);
        btnCentralVaciar.setBounds(30, 170, 300, 30);
        btnCentralIngresos.setBounds(30, 210, 300, 30);

        etiVOPelicula.setBounds(30, 260, 300, 20);
        btnVOCambiar.setBounds(30, 290, 300, 30);
        btnVONueva.setBounds(30, 330, 300, 30);
        btnVOOcupacion.setBounds(30, 370, 300, 30);
        btnVOVaciar.setBounds(30, 410, 300, 30);
        btnVOIngresos.setBounds(30, 450, 300, 30);

        btnIngresosTotales.setBounds(30, 500, 300, 30);

        add(etiCentralPelicula);
        add(btnCentralCambiar);
        add(btnCentralNueva);
        add(btnCentralOcupacion);
        add(btnCentralVaciar);
        add(btnCentralIngresos);

        add(etiVOPelicula);
        add(btnVOCambiar);
        add(btnVONueva);
        add(btnVOOcupacion);
        add(btnVOVaciar);
        add(btnVOIngresos);

        add(btnIngresosTotales);

        btnCentralCambiar.addActionListener(e -> {
            String t = JOptionPane.showInputDialog("Introduce el título:");
            if (t != null) {
                central.setPelicula(t);
                etiCentralPelicula.setText(t);
            }
        });

        btnCentralNueva.addActionListener(e -> central.entraUno());

        btnCentralOcupacion.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "Película: " + central.getPelicula() +
                        "\nAforo total: " + central.getAforo() +
                        "\nButacas ocupadas: " + central.getOcupadas() +
                        "\nButacas libres: " + central.getLibres() +
                        "\nPorcentaje ocupación: " + central.getPorcentaje() + "%"));

        btnCentralVaciar.addActionListener(e -> {
            central.Vaciar();
            etiCentralPelicula.setText("");
        });

        btnCentralIngresos.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "Ingresos: " + central.getIngresos() + " euros"));

        btnVOCambiar.addActionListener(e -> {
            String t = JOptionPane.showInputDialog("Introduce el título:");
            if (t != null) {
                vo.setPelicula(t);
                etiVOPelicula.setText(t);
            }
        });

        btnVONueva.addActionListener(e -> vo.entraUno());

        btnVOOcupacion.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "Película: " + vo.getPelicula() +
                        "\nAforo total: " + vo.getAforo() +
                        "\nButacas ocupadas: " + vo.getOcupadas() +
                        "\nButacas libres: " + vo.getLibres() +
                        "\nPorcentaje ocupación: " + vo.getPorcentaje() + "%"));

        btnVOVaciar.addActionListener(e -> {
            vo.Vaciar();
            etiVOPelicula.setText("");
        });

        btnVOIngresos.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "Ingresos: " + vo.getIngresos() + " euros"));

        btnIngresosTotales.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "Ingresos totales: " + (central.getIngresos() + vo.getIngresos()) + " euros"));
    }

    public static void main(String[] args) {
        new guia30().setVisible(true);
    }
}

class SalaCine {
    int Aforo, Ocupadas;
    String Pelicula;
    double Entrada;

    public SalaCine() {
        Aforo = 100;
        Ocupadas = 0;
        Pelicula = "";
        Entrada = 5.0;
    }

    public void setAforo(int a) {
        Aforo = a;
    }

    public void setOcupadas(int o) {
        Ocupadas = o;
    }

    public void setPelicula(String p) {
        Pelicula = p;
    }

    public void setEntrada(double e) {
        Entrada = e;
    }

    public void setLibres(int l) {
        Ocupadas = Aforo - l;
    }

    public int getAforo() {
        return Aforo;
    }

    public int getOcupadas() {
        return Ocupadas;
    }

    public String getPelicula() {
        return Pelicula;
    }

    public double getEntrada() {
        return Entrada;
    }

    public int getLibres() {
        return Aforo - Ocupadas;
    }

    public double getPorcentaje() {
        return (double) Ocupadas / Aforo * 100.0;
    }

    public double getIngresos() {
        return Ocupadas * Entrada;
    }

    public void Vaciar() {
        Ocupadas = 0;
        Pelicula = "";
    }

    public void entraUno() {
        Ocupadas++;
    }
}
