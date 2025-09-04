package comida;

public class Humeda implements EstrategiaComida {
    @Override
    public double calcular(double peso) {
        return peso * 0.05;
    }
}
