package com.mycompany.sueldotrabajador;
import java.util.Scanner;
public class SueldoTrabajador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Horas trabajadas a la semana: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("Pago por hora: ");
        double pagoPorHora = scanner.nextDouble();
        
        double sueldo = 0.0;
        
        if (horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * pagoPorHora;
        } else {
            sueldo = (40 * pagoPorHora) + ((horasTrabajadas - 40) * (pagoPorHora * 2));
        }
        
        System.out.println("El sueldo semanal es: $" + sueldo);
    }
}