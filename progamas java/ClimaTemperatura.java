package com.mycompany.climatemperatura;
import java.util.Scanner;

public class ClimaTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la temperatura actual en grados Celsius: ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 27) {
            System.out.println("Hace calor.");
        } else if (temperatura > 20) {
            System.out.println("Clima agradable.");
        } else {
            System.out.println("Clima fresco o frío.");
        }
    }
}