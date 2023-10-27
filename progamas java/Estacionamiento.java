package com.mycompany.estacionamiento;
import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Hora de entrada (en horas): ");
        int horaEntrada = scanner.nextInt();
        System.out.print("Hora de salida (en horas): ");
        int horaSalida = scanner.nextInt();
        
        int totalHoras = horaSalida - horaEntrada;
        double costo = 0.0;
        
        if (totalHoras <= 2) {
            costo = totalHoras * 5.0;
        } else if (totalHoras <= 5) {
            costo = 2 * 5.0 + (totalHoras - 2) * 4.0;
        } else if (totalHoras <= 10) {
            costo = 2 * 5.0 + 3 * 4.0 + (totalHoras - 5) * 3.0;
        } else {
            costo = 2 * 5.0 + 3 * 4.0 + 5 * 3.0 + (totalHoras - 10) * 2.0;
        }
        
        System.out.println("El costo total es: $" + costo);
    }
}