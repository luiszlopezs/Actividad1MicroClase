package comida;

public class Pienso implements Comida {
    @Override
    public double calcular(double peso) {
        return peso * 0.03;
    }
}
