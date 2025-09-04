package mascotas;

import comida.Comida;

public abstract class Mascota {
    protected String nombre;
    protected double peso;
    protected Comida estrategia;

    public Mascota(String nombre, double peso, Comida estrategia) {
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
