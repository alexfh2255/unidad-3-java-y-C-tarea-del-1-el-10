package com.mycompany.descuentotienda;
import java.util.Scanner;
public class DescuentoTienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el precio del primer artículo: ");
        double precio1 = scanner.nextDouble();
        System.out.print("Ingresa el precio del segundo artículo: ");
        double precio2 = scanner.nextDouble();
        System.out.print("Ingresa el precio del tercer artículo: ");
        double precio3 = scanner.nextDouble();

        double total = precio1 + precio2 + precio3;

        if (total > 1500) {
            total *= 0.7; // 30% de descuento;
        } else if (total >= 1000) {
            total *= 0.8; // 20% de descuento;
        } else if (total >= 700) {
            total *= 0.9; // 10% de descuento;
        }

        System.out.println("El total a pagar es: $" + total);
    }
}