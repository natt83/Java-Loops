package com.example;

import java.util.Scanner;

public class TabladeMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1");
        int numero = scanner .nextInt();

        for ( int i = 1; i <= 10; i ++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

        }
        scanner.close();
    }
    
}