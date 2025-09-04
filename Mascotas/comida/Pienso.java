package comida;

public class Pienso implements EstrategiaComida {
    @Override
    public double calcular(double peso) {
        return peso * 0.03;
    }
}
