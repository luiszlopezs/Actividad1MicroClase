package comida;

public class Humeda implements Comida {
    @Override
    public double calcular(double peso) {
        return peso * 0.05;
    }
}
