package com.mycompany.compararnumeros;
import java.util.Scanner;
public class CompararNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            System.out.println("El primer número es mayor.");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número es mayor.");
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}