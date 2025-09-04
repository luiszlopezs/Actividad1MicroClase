package comida;

public class Natural implements Comida {
    @Override
    public double calcular(double peso) {
        return peso * 0.04;
    }
}
