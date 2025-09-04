package main;

import comida.*;
import java.util.Scanner;
import mascotas.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Selección de mascota
        System.out.println("Elige una mascota:");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Conejo");
        int opcionMascota = sc.nextInt();

        // 2. Ingreso de peso
        System.out.print("Ingresa el peso de la mascota en kg: ");
        double peso = sc.nextDouble();

        // 3. Selección de tipo de comida
        System.out.println("Elige el tipo de comida:");
        System.out.println("1. Pienso");
        System.out.println("2. Natural");
        System.out.println("3. Húmeda");
        int opcionComida = sc.nextInt();

        // Estrategia de comida
        EstrategiaComida comida = null;
        switch (opcionComida) {
            case 1:
                comida = new Pienso();
                break;
            case 2:
                comida = new Natural();
                break;
            case 3:
                comida = new Humeda();
                break;
            default:
                System.out.println("Opción de comida inválida.");
                System.exit(0);
        }

        // Crear mascota 
        Mascota mascota = null;
        switch (opcionMascota) {
            case 1:
                mascota = new Perro("Perro", peso, comida);
                break;
            case 2:
                mascota = new Gato("Gato", peso, comida);
                break;
            case 3:
                mascota = new Conejo("Conejo", peso, comida);
                break;
            default:
                System.out.println("Opción de mascota inválida.");
                System.exit(0);
        }

        // 4. Mostrar resultado
        System.out.println(mascota.getNombre() + " de " + peso + " kg debe comer "
                + mascota.calcularAlimento() + " kg diarios.");

        sc.close();
    }
}

