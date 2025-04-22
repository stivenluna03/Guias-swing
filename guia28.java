public class guia28 {
    private double base;
    private double altura;

    public guia28() {
        base = 0;
        altura = 0;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        guia28 suelo = new guia28();
        suelo.setBase(30);
        suelo.setAltura(50);

        double area = suelo.getArea();
        double peri = suelo.getPerimetro();

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + peri);
    }
}
