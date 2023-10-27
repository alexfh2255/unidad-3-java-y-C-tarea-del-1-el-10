
package com.mycompany.calificaciones;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Ingresa la calificación " + i + ": ");
            double calificacion = scanner.nextDouble();
            suma += calificacion;
        }

        double promedio = suma / 6;

        if (promedio >= 70) {
            System.out.println("Aprobaste la materia con un promedio de " + promedio);
        } else {
            System.out.println("Reprobaste la materia con un promedio de " + promedio);
        }
    }
}
