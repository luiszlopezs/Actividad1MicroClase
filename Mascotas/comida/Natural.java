package comida;

public class Natural implements EstrategiaComida {
    @Override
    public double calcular(double peso) {
        return peso * 0.04;
    }
}
