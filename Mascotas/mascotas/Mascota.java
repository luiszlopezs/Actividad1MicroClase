package mascotas;

import comida.EstrategiaComida;

public abstract class Mascota {
    protected String nombre;
    protected double peso;
    protected EstrategiaComida estrategia;

    public Mascota(String nombre, double peso, EstrategiaComida estrategia) {
        this.nombre = nombre;
        this.peso = peso;
        this.estrategia = estrategia;
    }

    public double calcularAlimento() {
        return estrategia.calcular(peso);
    }

    public String getNombre() {
        return nombre;
    }
}
