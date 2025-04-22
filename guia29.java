public class guia29 {

    double Base;
    double Altura;

    public guia29() {
        Base = 100;
        Altura = 50;
    }

    public void setBase(double b) {
        Base = b;
    }

    public void setAltura(double a) {
        Altura = a;
    }

    public double getBase() {
        return Base;
    }

    public double getAltura() {
        return Altura;
    }

    public double getArea() {
        return Base * Altura;
    }

    public double getPerimetro() {
        return 2 * (Base + Altura);
    }

    public void Cuadrar() {
        Altura = Base;
    }
}
